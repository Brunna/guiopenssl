/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaCriarChavePrivada.java
 *
 * Created on 14/12/2011, 21:15:45
 */
package guiopenssl.gui;

import guiopenssl.utilities.Shell;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author edviges
 */
public class TelaCriarChavePrivada extends javax.swing.JFrame {

    private Long numeroBits;
    
        
    /** Creates new form TelaCriarChavePrivada */
    public TelaCriarChavePrivada() {
        initComponents();
    }
    
    public boolean ValidaForm(){
        
        if(campoNumBits.getText().equals("")){
            numeroBits = 512L;
        }else{
            numeroBits = Long.parseLong(campoNumBits.getText());
            
            if(numeroBits < 512){
                        JOptionPane.showMessageDialog(null, "Digite um número válido maior ou igual que 512!", "Alerta", JOptionPane.ERROR_MESSAGE);
                        campoNumBits.grabFocus();
                        return false;
            }
        }
        
        if (caminhoArquivoDestinoChavePrivada.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Crie o arquivo no local de destino!", "Alerta", JOptionPane.ERROR_MESSAGE);
            caminhoArquivoDestinoChavePrivada.grabFocus();
            return false;
        }
        
        if ((campoSenha.getPassword().length == 0) && !botaoNenhum.isSelected()) {
            JOptionPane.showMessageDialog(null, "Digite um senha para a criptografia!", "Alerta", JOptionPane.ERROR_MESSAGE);
            campoSenha.grabFocus();
            return false;
        }

        if ((campoSenha.getText().compareTo(campoConfSenha.getText()) != 0) && !botaoNenhum.isSelected()) {
            JOptionPane.showMessageDialog(null, "Senhas não conferem!", "Alerta", JOptionPane.ERROR_MESSAGE);
            campoSenha.grabFocus();
            campoConfSenha.grabFocus();
            return false;
        }
        
        if(botaoNenhum.isSelected()){
            campoSenha.setEnabled(false);
            campoConfSenha.setEnabled(false);
            return true;
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
        labelNumBits = new javax.swing.JLabel();
        campoNumBits = new javax.swing.JTextField();
        campoConfSenha = new javax.swing.JPasswordField();
        labelConfSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        labelSenha = new javax.swing.JLabel();
        botaoCriaChavePrivada = new javax.swing.JButton();
        labelArquivoDestinoChavePrivada = new javax.swing.JLabel();
        caminhoArquivoDestinoChavePrivada = new javax.swing.JTextField();
        selecionarArquivoDestinoChaveprivada = new javax.swing.JButton();
        labelParamEncrip = new javax.swing.JLabel();
        botaoDES = new javax.swing.JRadioButton();
        botaoTripleDES = new javax.swing.JRadioButton();
        botaoNenhum = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelNumBits.setText("Selecione o número de bits:");

        campoNumBits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumBitsActionPerformed(evt);
            }
        });
        campoNumBits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNumBitsKeyTyped(evt);
            }
        });

        campoConfSenha.setEnabled(false);

        labelConfSenha.setText("Confirme senha:");

        campoSenha.setEnabled(false);

        labelSenha.setText("Digite senha:");

        botaoCriaChavePrivada.setText("Criar Chave Privada!");
        botaoCriaChavePrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriaChavePrivadaActionPerformed(evt);
            }
        });

        labelArquivoDestinoChavePrivada.setText("Crie a chave no local de destino:");

        caminhoArquivoDestinoChavePrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoArquivoDestinoChavePrivadaActionPerformed(evt);
            }
        });

        selecionarArquivoDestinoChaveprivada.setText("selecionar");
        selecionarArquivoDestinoChaveprivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarArquivoDestinoChaveprivadaActionPerformed(evt);
            }
        });

        labelParamEncrip.setText("Parâmetro de encriptação:");

        buttonGroup1.add(botaoDES);
        botaoDES.setText("DES");
        botaoDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDESActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoTripleDES);
        botaoTripleDES.setText("TRIPLE-DES");
        botaoTripleDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTripleDESActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoNenhum);
        botaoNenhum.setSelected(true);
        botaoNenhum.setText("Nenhum");
        botaoNenhum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNenhumActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelArquivoDestinoChavePrivada)
                            .addComponent(labelNumBits))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNumBits, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(caminhoArquivoDestinoChavePrivada, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecionarArquivoDestinoChaveprivada))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addComponent(labelConfSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoSenha)
                            .addComponent(campoConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(botaoCriaChavePrivada))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelParamEncrip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoTripleDES)
                            .addComponent(botaoDES)
                            .addComponent(botaoNenhum))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumBits)
                    .addComponent(campoNumBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecionarArquivoDestinoChaveprivada)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelArquivoDestinoChavePrivada)
                        .addComponent(caminhoArquivoDestinoChavePrivada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelParamEncrip)
                    .addComponent(botaoDES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoTripleDES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoNenhum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelConfSenha)
                    .addComponent(botaoCriaChavePrivada))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void campoNumBitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumBitsActionPerformed
// TODO add your handling code here: 
}//GEN-LAST:event_campoNumBitsActionPerformed

private void campoNumBitsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNumBitsKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_campoNumBitsKeyTyped

private void caminhoArquivoDestinoChavePrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminhoArquivoDestinoChavePrivadaActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showDialog(null, "Salvar");

    if (retorno == JFileChooser.APPROVE_OPTION) {
        caminho = abrir.getSelectedFile().getAbsolutePath();
        caminhoArquivoDestinoChavePrivada.setText(caminho);
    }
}//GEN-LAST:event_caminhoArquivoDestinoChavePrivadaActionPerformed

private void selecionarArquivoDestinoChaveprivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarArquivoDestinoChaveprivadaActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showDialog(null, "Salvar");

    if (retorno == JFileChooser.APPROVE_OPTION) {
        caminho = abrir.getSelectedFile().getAbsolutePath();
        caminhoArquivoDestinoChavePrivada.setText(caminho);
    }
}//GEN-LAST:event_selecionarArquivoDestinoChaveprivadaActionPerformed

private void botaoCriaChavePrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriaChavePrivadaActionPerformed
    // TODO add your handling code here:
    Shell s = new Shell();
    String comando = "openssl genrsa ";
    BufferedWriter bw = null;
    
    if(ValidaForm()){
        String caminhoChave = caminhoArquivoDestinoChavePrivada.getText();
        File fDestino = new File(caminhoChave);

        if(botaoDES.isSelected()){
            comando = comando + "-out " + caminhoChave +" -passout pass:"+ campoSenha.getText() + " -des " + numeroBits;
        }
        if(botaoTripleDES.isSelected()){
            comando = comando + "-out " + caminhoChave +" -passout pass:"+ campoSenha.getText() + " -des3 " + numeroBits; 
        }
        if(botaoNenhum.isSelected()){
            comando = comando + "-out " + caminhoChave + " " + numeroBits;
        }
        
        System.out.println(comando);
        
        s.ExecComandoShell(comando);
        
        try {
            Thread.sleep(1000);//tem que dar um sleep se ñ o arquivo ñ é gerado acho q 1 a 3 segundos ta bom 1000 = 1s
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaCriptSimetrica.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(fDestino.exists() && fDestino.length()>1){//teste para ver se arquivo foi gerado com sucesso.
               JOptionPane.showMessageDialog(null, "Chave gerada com Sucesso! " + fDestino.getName() ,"OK" , JOptionPane.INFORMATION_MESSAGE);
        }else{
               JOptionPane.showMessageDialog(null, "Erro ao gerar chave! Tente Novamente.","Alerta" , JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }    

}//GEN-LAST:event_botaoCriaChavePrivadaActionPerformed

private void botaoDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDESActionPerformed
// TODO add your handling code here:
    if(botaoDES.isSelected()){
        campoSenha.setEnabled(true);
        campoConfSenha.setEnabled(true);
        
        campoSenha.grabFocus();
    }
}//GEN-LAST:event_botaoDESActionPerformed

private void botaoTripleDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTripleDESActionPerformed
// TODO add your handling code here:
    if(botaoTripleDES.isSelected()){
        campoSenha.setEnabled(true);
        campoConfSenha.setEnabled(true);
        
        campoSenha.grabFocus();
    }
}//GEN-LAST:event_botaoTripleDESActionPerformed

private void botaoNenhumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNenhumActionPerformed
// TODO add your handling code here:
    if(botaoNenhum.isSelected()){
        campoSenha.setEnabled(false);
        campoConfSenha.setEnabled(false);
    }
}//GEN-LAST:event_botaoNenhumActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCriarChavePrivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarChavePrivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarChavePrivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarChavePrivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaCriarChavePrivada().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriaChavePrivada;
    private javax.swing.JRadioButton botaoDES;
    private javax.swing.JRadioButton botaoNenhum;
    private javax.swing.JRadioButton botaoTripleDES;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField caminhoArquivoDestinoChavePrivada;
    private javax.swing.JPasswordField campoConfSenha;
    private javax.swing.JTextField campoNumBits;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel labelArquivoDestinoChavePrivada;
    private javax.swing.JLabel labelConfSenha;
    private javax.swing.JLabel labelNumBits;
    private javax.swing.JLabel labelParamEncrip;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JButton selecionarArquivoDestinoChaveprivada;
    // End of variables declaration//GEN-END:variables
}
