/* -------------------------------------------------------------------------- *
 * OpenSim: FileLoadStandardModelsAction.java                                 *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */
package org.opensim.view;

import java.io.File;
import java.io.FileFilter;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class FileLoadStandardModelsAction extends CallableSystemAction {
    
    public void performAction() {
        // TODO implement action body
    }
    
    public String getName() {
        return NbBundle.getMessage(FileLoadStandardModelsAction.class, "CTL_FileLoadBuiltinModelsAction");
    }
    
    protected void initialize() {
        super.initialize();
        // see org.openide.util.actions.SystemAction.iconResource() javadoc for more details
        putValue("noIconInMenu", Boolean.TRUE);
    }
    
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous() {
        return false;
    }
    
    public JMenuItem getMenuPresenter() {
      JMenu displayMenu = new JMenu("Models");
      FileFilter fileFilter = new FileFilter() {
                public boolean accept(File file) {
                    return (!file.isDirectory()&& file.getName().endsWith(".osim"));
                }
      };
      String modelsRootDirectory=NbBundle.getMessage(FileLoadStandardModelsAction.class, "CTL_BuiltinModels_Root");
      File rootModelsDirectory= new File(modelsRootDirectory);
      String fullPath = rootModelsDirectory.getAbsolutePath();
      
      System.out.println("Showing models from directory "+fullPath);
      File[] files = rootModelsDirectory.listFiles(fileFilter);
      if (files == null)  return displayMenu;
      
      for (int i=0; i<files.length; i++){
        // List all files in models directory 
         displayMenu.add(new OpenModelFileAction(files[i]));
      }
      return displayMenu;
    }
    
}
