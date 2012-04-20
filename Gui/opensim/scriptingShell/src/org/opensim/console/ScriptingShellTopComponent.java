/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.console;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.python.util.PythonInterpreter; 
/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//org.opensim.console//ScriptingShell//EN",
autostore = false)
@TopComponent.Description(preferredID = "ScriptingShellTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "org.opensim.console.ScriptingShellTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_ScriptingShellAction",
preferredID = "ScriptingShellTopComponent")
public final class ScriptingShellTopComponent extends TopComponent {
private PythonInterpreter interp;

public ScriptingShellTopComponent() {
        //fileTextFieldAndChooser1.setFileFilter(FileUtils.getFileFilter(".py", "Python script file to load"));
        initComponents();
        instance = this;
        interp = jConsole2.interp;
        
        setName(NbBundle.getMessage(ScriptingShellTopComponent.class, "CTL_ScriptingShellTopComponent"));
        setToolTipText(NbBundle.getMessage(ScriptingShellTopComponent.class, "HINT_ScriptingShellTopComponent"));
        putClientProperty(TopComponent.PROP_MAXIMIZATION_DISABLED, Boolean.TRUE);
        putClientProperty(TopComponent.PROP_SLIDING_DISABLED, Boolean.TRUE);
        jPopupMenu1.removeAll();
        addPopupCommands();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jConsole2 = new org.opensim.console.JConsole();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setToolTipText(org.openide.util.NbBundle.getMessage(ScriptingShellTopComponent.class, "ScriptingShellTopComponent.toolTipText")); // NOI18N

        jSplitPane1.setDividerLocation(240);

        jConsole2.setColumns(20);
        jConsole2.setRows(5);
        jScrollPane2.setViewportView(jConsole2);

        jSplitPane1.setLeftComponent(jScrollPane2);

        jEditorPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(ScriptingShellTopComponent.class, "ScriptingShellTopComponent.jEditorPane1.border.title"))); // NOI18N
        jEditorPane1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane3.setViewportView(jEditorPane1);

        jSplitPane1.setRightComponent(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.opensim.console.JConsole jConsole2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
    
    public static synchronized ScriptingShellTopComponent getDefault() {
       if (instance == null) {
          instance = new ScriptingShellTopComponent();
       }
       return instance;
    }
    private static ScriptingShellTopComponent instance;

    PythonInterpreter getInterp() {
        return interp;
    }

    void logMessage(String string) {
        jEditorPane1.setText(jEditorPane1.getText()+"#"+string+"\n");
    }
    private void addPopupCommands() {
        JMenuItem clearItem = jPopupMenu1.add("Clear");
        clearItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                jEditorPane1.setText("");
            }});
}
}
