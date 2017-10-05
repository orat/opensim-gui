/* -------------------------------------------------------------------------- *
 * OpenSim: ActuatorGroupNode.java                                            *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib, Peter Loan, Jeff Reinbolt                          *
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
 *
 * ActuatorGroupNode
 * Author(s): Peter Loan & Jeff Reinbolt
 */
package org.opensim.view.nodes;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.ResourceBundle;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.NbBundle;
import org.opensim.modeling.ArrayConstObjPtr;
import org.opensim.modeling.Muscle;
import org.opensim.modeling.ObjectGroup;

/**
 *
 * @author Peter Loan & Jeff Reinbolt
 *
 * Top level Actuators node in Navigator view
 */
public class ActuatorGroupNode extends OpenSimObjectNode {
   
   private static ResourceBundle bundle = NbBundle.getBundle(ActuatorGroupNode.class);
   /**
    * Creates a new instance of ActuatorGroupNode
    */
   public ActuatorGroupNode(ObjectGroup group) {
      super(group);
      setDisplayName(group.getName());
      setShortDescription(bundle.getString("HINT_ActuatorGroupNode"));
      Children children = getChildren();
      ArrayConstObjPtr members = group.getMembers();
      for (int i = 0; i < members.getSize(); i++ ) {
         Node[] arrNodes = new Node[1];
         Muscle msl = Muscle.safeDownCast(members.getitem(i));
         if (msl != null) {
            OneMuscleNode node = new OneMuscleNode(msl);
            arrNodes[0] = node;
         } else {
            OneActuatorNode node = new OneActuatorNode(members.getitem(i));
            arrNodes[0] = node;
         }
         children.add(arrNodes);
      }
      if (getChildren().getNodesCount()==0) setChildren(Children.LEAF);
      addDisplayOption(displayOption.Showable);
      addDisplayOption(displayOption.Isolatable);
      addDisplayOption(displayOption.Colorable);
   }
   
      public Image getIcon(int i) {
      URL imageURL=null;
      try {
         imageURL = Class.forName("org.opensim.view.nodes.OpenSimNode").getResource("/org/opensim/view/nodes/icons/musclesNode.png");
      } catch (ClassNotFoundException ex) {
         ex.printStackTrace();
      }
      if (imageURL != null) {
         return new ImageIcon(imageURL, "").getImage();
      } else {
         return null;
      }
   }
   
   public Image getOpenedIcon(int i) {
      URL imageURL=null;
      try {
         imageURL = Class.forName("org.opensim.view.nodes.OpenSimNode").getResource("/org/opensim/view/nodes/icons/musclesNode.png");
      } catch (ClassNotFoundException ex) {
         ex.printStackTrace();
      }
      if (imageURL != null) {
         return new ImageIcon(imageURL, "").getImage();
      } else {
         return null;
      }
   }
   
   /**
    * Display name 
    */
   public String getHtmlDisplayName() {
      return getOpenSimObject().getName() ;
   }
}
