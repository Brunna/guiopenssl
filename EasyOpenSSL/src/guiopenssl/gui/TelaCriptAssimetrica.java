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

import java.io.BufferedReader;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import guiopenssl.utilities.Shell;
import guiopenssl.gui.TelaCriarChavePrivada;


/**
 *
 * @author Edviges
 */
public class TelaCriptAssimetrica extends javax.swing.JFrame {
    
    

    /** Creates new form TelaCriptSimetrica */
    public TelaCriptAssimetrica() {
        initComponents();
    }

    public boolean ValidarForm() {

        if (chavePrivadaSim.isSelected() && caminhoChavePrivada.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione a Chave Privada!", "Alerta", JOptionPane.ERROR_MESSAGE);
            caminhoArquivoOrigem.grabFocus();
            return false;
        }
        
        if (caminhoArquivoOrigem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione o caminho do Arquivo!", "Alerta", JOptionPane.ERROR_MESSAGE);
            caminhoArquivoOrigem.grabFocus();
            return false;
        }
        
        if (caminhoArquivoDestino.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Crie o arquivo no local de destino!", "Alerta", JOptionPane.ERROR_MESSAGE);
            caminhoArquivoDestino.grabFocus();
            return false;
        }
        
        return true;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelTipoAlgoritmo = new javax.swing.JLabel();
        tipoAlgoritmo = new javax.swing.JComboBox();
        labelArquivoOrigem = new javax.swing.JLabel();
        selecionarArquivoOrigem = new javax.swing.JButton();
        caminhoArquivoOrigem = new javax.swing.JTextField();
        labelArquivoDestino = new javax.swing.JLabel();
        caminhoArquivoDestino = new javax.swing.JTextField();
        selecionarArquivoDestino = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoCriptografar = new javax.swing.JButton();
        labelSePossuiChavePrivada = new javax.swing.JLabel();
        chavePrivadaSim = new javax.swing.JRadioButton();
        chavePrivadaNao = new javax.swing.JRadioButton();
        caminhoChavePrivada = new javax.swing.JTextField();
        botaoChavePrivada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criptografia Assimétrica");

        labelTipoAlgoritmo.setText("Selecione o tipo de algoritmo:");

        tipoAlgoritmo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diffie-Hellman", "RSA com parâmetro de encriptação DES", "RSA com parâmetro de encriptação DES3", "DSA (Digital Assignature Algorithm)" }));
        tipoAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAlgoritmoActionPerformed(evt);
            }
        });

        labelArquivoOrigem.setText("Selecione o arquivo de origem:");

        selecionarArquivoOrigem.setText("selecionar");
        selecionarArquivoOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarArquivoOrigemActionPerformed(evt);
            }
        });

        caminhoArquivoOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoArquivoOrigemActionPerformed(evt);
            }
        });

        labelArquivoDestino.setText("Crie o arquivo de destino no diretório desejado:");

        caminhoArquivoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoArquivoDestinoActionPerformed(evt);
            }
        });

        selecionarArquivoDestino.setText("selecionar");
        selecionarArquivoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarArquivoDestinoActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoCriptografar.setText("Criptografar!");
        botaoCriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriptografarActionPerformed(evt);
            }
        });

        labelSePossuiChavePrivada.setText("Já possui chave privada?");

        buttonGroup1.add(chavePrivadaSim);
        chavePrivadaSim.setText("Sim,");
        chavePrivadaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chavePrivadaSimActionPerformed(evt);
            }
        });

        buttonGroup1.add(chavePrivadaNao);
        chavePrivadaNao.setText("Não, desejo criar uma agora.");
        chavePrivadaNao.setToolTipText("<html><spam><b>Ação será executada ao presssionar \"Criptografar!\"</b></spam></html>");
        chavePrivadaNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chavePrivadaNaoActionPerformed(evt);
            }
        });

        caminhoChavePrivada.setEnabled(false);

        botaoChavePrivada.setText("selecionar");
        botaoChavePrivada.setEnabled(false);
        botaoChavePrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChavePrivadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipoAlgoritmo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoAlgoritmo, 0, 473, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSePossuiChavePrivada)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chavePrivadaSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caminhoChavePrivada, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoChavePrivada))
                            .addComponent(chavePrivadaNao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelArquivoDestino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caminhoArquivoDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelArquivoOrigem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caminhoArquivoOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecionarArquivoOrigem)
                            .addComponent(selecionarArquivoDestino)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addGap(14, 14, 14)
                        .addComponent(botaoCriptografar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoAlgoritmo)
                    .addComponent(tipoAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chavePrivadaSim)
                            .addComponent(caminhoChavePrivada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoChavePrivada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chavePrivadaNao))
                    .addComponent(labelSePossuiChavePrivada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArquivoOrigem)
                    .addComponent(caminhoArquivoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionarArquivoOrigem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArquivoDestino)
                    .addComponent(caminhoArquivoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionarArquivoDestino))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoCriptografar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tipoAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAlgoritmoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tipoAlgoritmoActionPerformed

private void caminhoArquivoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminhoArquivoOrigemActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_caminhoArquivoOrigemActionPerformed

private void caminhoArquivoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminhoArquivoDestinoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_caminhoArquivoDestinoActionPerformed

private void selecionarArquivoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarArquivoDestinoActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showDialog(null, "Salvar");

    if (retorno == JFileChooser.APPROVE_OPTION) {
        caminho = abrir.getSelectedFile().getAbsolutePath();
        caminhoArquivoDestino.setText(caminho);
    }
}//GEN-LAST:event_selecionarArquivoDestinoActionPerformed

private void selecionarArquivoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarArquivoOrigemActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showOpenDialog(null);

    if (retorno == JFileChooser.APPROVE_OPTION) {
        caminho = abrir.getSelectedFile().getAbsolutePath();
        caminhoArquivoOrigem.setText(caminho);
    }
}//GEN-LAST:event_selecionarArquivoOrigemActionPerformed

private void botaoCriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriptografarActionPerformed
// TODO add your handling code here:
    Shell s = new Shell();
    BufferedReader buf;
    String shell = "openssl ";

    if (ValidarForm()) {
        String caminhoChave = caminhoChavePrivada.getText();
        String caminhoOrigem = caminhoArquivoOrigem.getText();
        String caminhoDestino = caminhoArquivoDestino.getText();
        String caminhoArqSenha;
        File fOrigem = new File(caminhoOrigem);
        File fDestino = new File(caminhoDestino);

        switch (tipoAlgoritmo.getSelectedIndex()) {
            case 0:
                
                break;
            case 1:
                shell = shell + "rsa -des";
                break;
        }
        
        shell = shell + "-in " + caminhoChave + " ";
       
       shell = shell + "-out " + caminhoDestino + " ";
        
        
        
        s.ExecComandoShell(shell);//executando o comando
        
        
       
       try {
            Thread.sleep(1000);//tem que dar um sleep se ñ o arquivo ñ é gerado acho q 1 a 3 segundos ta bom 1000 = 1s
       } catch (InterruptedException ex) {
            Logger.getLogger(TelaCriptSimetrica.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       if(fDestino.exists() && fDestino.length()>1){//teste para ver se arquivo foi gerado com sucesso.
           JOptionPane.showMessageDialog(null, "Arquivo gerado com Sucesso! " + fDestino.getName() ,"OK" , JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "Erro ao Criptografar " + fOrigem.getName(),"Alerta" , JOptionPane.ERROR_MESSAGE);
       }
    }
}//GEN-LAST:event_botaoCriptografarActionPerformed

private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_botaoCancelarActionPerformed

private void chavePrivadaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chavePrivadaNaoActionPerformed
// TODO add your handling code here:
    
    if(chavePrivadaNao.isSelected()){
        
        caminhoChavePrivada.setEnabled(false);
        botaoChavePrivada.setEnabled(false);
        
        TelaCriarChavePrivada telachaveprivada = new TelaCriarChavePrivada();
        telachaveprivada.setVisible(true);
        
    }
}//GEN-LAST:event_chavePrivadaNaoActionPerformed

private void chavePrivadaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chavePrivadaSimActionPerformed
// TODO add your handling code here:
    if(chavePrivadaSim.isSelected()){
        caminhoChavePrivada.setEnabled(true);
        botaoChavePrivada.setEnabled(true);
        caminhoChavePrivada.grabFocus();
    }
}//GEN-LAST:event_chavePrivadaSimActionPerformed

private void botaoChavePrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChavePrivadaActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showOpenDialog(null);

    if (retorno == JFileChooser.APPROVE_OPTION) {
        caminho = abrir.getSelectedFile().getAbsolutePath();
        caminhoChavePrivada.setText(caminho);
    }
}//GEN-LAST:event_botaoChavePrivadaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCriptAssimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriptAssimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriptAssimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriptAssimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaCriptAssimetrica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoChavePrivada;
    private javax.swing.JButton botaoCriptografar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField caminhoArquivoDestino;
    private javax.swing.JTextField caminhoArquivoOrigem;
    private javax.swing.JTextField caminhoChavePrivada;
    private javax.swing.JRadioButton chavePrivadaNao;
    private javax.swing.JRadioButton chavePrivadaSim;
    private javax.swing.JLabel labelArquivoDestino;
    private javax.swing.JLabel labelArquivoOrigem;
    private javax.swing.JLabel labelSePossuiChavePrivada;
    private javax.swing.JLabel labelTipoAlgoritmo;
    private javax.swing.JButton selecionarArquivoDestino;
    private javax.swing.JButton selecionarArquivoOrigem;
    private javax.swing.JComboBox tipoAlgoritmo;
    // End of variables declaration//GEN-END:variables
}
