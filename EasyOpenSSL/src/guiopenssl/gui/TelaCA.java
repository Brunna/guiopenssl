/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaCriptSimetrica.java
 *
 * Created on 09/12/2011, 22:25:40
 */
package guiopenssl.gui;

import guiopenssl.utilities.Shell;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class TelaCA extends javax.swing.JFrame {

    /** Creates new form TelaCriptSimetrica */
    public TelaCA() {
        initComponents();
    }

    public void ValidarForm() {
        
                
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCA = new javax.swing.JLabel();
        criaCAButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criptografia Assimétrica");

        labelCA.setText("Informe a senha para gerar a autoridade certificadora:");

        criaCAButton.setText("Criar");
        criaCAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaCAButtonActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelCA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(criaCAButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCA)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(criaCAButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void criaCAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaCAButtonActionPerformed
// TODO add your handling code here:
    Shell s = new Shell();
    BufferedReader buffer;
    String shell = "openssl ";
    
    shell = shell + "req  -new -keyout cakey.pem -out careq.pem -passout pass:1234567890";
               
    s.ExecComandoShell(shell);
    
        try {
            BufferedWriter bufferwrite = s.GetbufferWrite();
            for(int i = 0; i < 9; i++){
            bufferwrite.write("\n");
            bufferwrite.flush();
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaCA.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    shell = shell + "ca  -create_serial -out cacert.pem -days 1095 -batch -keyfile cakey.pem -selfsign -extensions v3_ca -infiles careq.pem";
    
    s.ExecComandoShell(shell);
}//GEN-LAST:event_criaCAButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaCA().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criaCAButton;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelCA;
    // End of variables declaration//GEN-END:variables
}
