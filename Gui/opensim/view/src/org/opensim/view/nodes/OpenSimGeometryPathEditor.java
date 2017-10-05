/* -------------------------------------------------------------------------- *
 * OpenSim: OpenSimGeometryPathEditor.java                                    *
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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.view.nodes;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.GeometryPath;
import org.opensim.modeling.OpenSimObject;

/**
 *
 * @author ayman
 */
public class OpenSimGeometryPathEditor extends OpenSimCustomEditor  {

    GeometryPath objectToEdit;


    public OpenSimGeometryPathEditor(AbstractProperty ap, GeometryPath obj, OpenSimObjectNode osNode){
        super(ap, osNode); 
        
    }

    @Override
    public String getAsText() {
        return objectToEdit.toString();
    }

    @Override
    public Component getCustomEditor() {
       if (objectToEdit == null) return new JPanel().add(new JLabel(" Only individual selections  of this type can be edited."));
        return new OpenSimGeometryPathEditorPanel(objectToEdit);
    }

    @Override
    public Object getValue() {
        return objectToEdit;
    }


    @Override
    public void setValue(Object value) {
        if (value instanceof OpenSimObject)
            objectToEdit = (GeometryPath) value;
        super.setValue(value);
    }
    
    
}
