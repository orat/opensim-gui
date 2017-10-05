/* -------------------------------------------------------------------------- *
 * OpenSim: ErrorPanel.java                                                   *
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
 * ErrorPanel.java
 *
 * Created on July 11, 2007, 7:29 PM
 */

package org.opensim.utils;

/**
 *
 * @author  erang
 *
 * TODO: made the details portion of the dialog hidden by default, with a "Show Details" button to access them (similar
 * to the way other apps do error reporting)
 */
public class ErrorPanel extends javax.swing.JPanel {
   
   /** Creates new form ErrorPanel */
   public ErrorPanel() {
      initComponents();
   }

   public void setText(String message, String details) {
      messageTextArea.setText(message);
      detailsTextArea.setText(details);
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents() {
      messageTextArea = new javax.swing.JTextArea();
      detailsTextArea = new javax.swing.JTextArea();
      jLabel1 = new javax.swing.JLabel();

      messageTextArea.setColumns(20);
      messageTextArea.setFont(new java.awt.Font("Tahoma", 0, 11));
      messageTextArea.setLineWrap(true);
      messageTextArea.setRows(5);
      messageTextArea.setText("Message");
      messageTextArea.setWrapStyleWord(true);
      messageTextArea.setMinimumSize(new java.awt.Dimension(20, 18));
      messageTextArea.setOpaque(false);

      detailsTextArea.setColumns(20);
      detailsTextArea.setFont(new java.awt.Font("Monospaced", 0, 11));
      detailsTextArea.setLineWrap(true);
      detailsTextArea.setRows(5);
      detailsTextArea.setText("Details");
      detailsTextArea.setWrapStyleWord(true);
      detailsTextArea.setMinimumSize(new java.awt.Dimension(20, 20));

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
      jLabel1.setText("Details:");

      org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
               .add(org.jdesktop.layout.GroupLayout.LEADING, detailsTextArea, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
               .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)
               .add(org.jdesktop.layout.GroupLayout.LEADING, messageTextArea, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(messageTextArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jLabel1)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(detailsTextArea, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addContainerGap())
      );
   }// </editor-fold>//GEN-END:initComponents
   
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextArea detailsTextArea;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JTextArea messageTextArea;
   // End of variables declaration//GEN-END:variables
   
}
