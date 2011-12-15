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

/**
 *
 * @author gabriel
 */
public class TelaCriptSimetrica extends javax.swing.JFrame {

    /** Creates new form TelaCriptSimetrica */
    public TelaCriptSimetrica() {
        initComponents();
    }
    
    public boolean ValidarForm(){
        
        if(caminhoArquivoCriptografa.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Escolha o caminho do Arquivo!", "Alert" , JOptionPane.ERROR_MESSAGE);
                caminhoArquivoCriptografa.grabFocus();
                return false;
        }
        if(nomeArquivoDestino.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Escolha o arquivo Destino!","alert" , JOptionPane.ERROR_MESSAGE);
               nomeArquivoDestino.grabFocus();
               return false;
        }
        if(password.getText().equals("") && !lerChaveArq.isSelected()){
            JOptionPane.showMessageDialog(null, "Digite um senha para a criptografia!","alert" , JOptionPane.ERROR_MESSAGE);
            password.grabFocus();
            return false;
        }
        if(lerChaveArq.isSelected()){
            if(CaminhoArquivoSenha.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Escolha o arquivo com a senha! (A senha deve estar na primeira linha do arquivo.)","alert" , JOptionPane.ERROR_MESSAGE);
               CaminhoArquivoSenha.grabFocus();
               return false;
            }
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

        tipoAlgoritmo = new javax.swing.JComboBox();
        bCriptografar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        caminhoArquivoCriptografa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeArquivoDestino = new javax.swing.JTextField();
        verificacaoSalt = new javax.swing.JCheckBox();
        prossDadoBase64 = new javax.swing.JCheckBox();
        lerChaveArq = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CaminhoArquivoSenha = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        b_decriptografa = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tipoAlgoritmo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "base64 - Base 64", "bf-cbc - Blowfish in CBC mode", "bf-cfb - Blowfish in CFB mode", "bf-ecb - Blowfish in ECB mode", "bf-ofb - Blowfish in OFB mode", "cast-cbc - CAST in CBC mode", "cast5-cbc - CAST5 in CBC mode", "cast5-cfb - CAST5 in CFB mode", "cast5-ecb - CAST5 in ECB mode", "cast5-ofb - CAST5 in OFB mode", "des-cbc - DES in CBC mode", "des-cfb - DES in CBC mode", "des-ofb - DES in OFB mode", "des-ecb - DES in ECB mode", "des-ede-cbc - Two key triple DES EDE in CBC mode", "des-ede - Two key triple DES EDE in ECB mode", "des-ede-cfb - Two key triple DES EDE in CFB mode", "des-ede-ofb - Two key triple DES EDE in OFB mode", "des-ede3-cbc - Three key triple DES EDE in CBC mode", "des-ede3 - Three key triple DES EDE in ECB mode", "des-ede3-cfb - Three key triple DES EDE CFB mode", "des-ede3-ofb  - Three key triple DES EDE in OFB mode", "desx - DESX algorithm.", "gost89 - GOST 28147-89 in CFB mode (provided by ccgost engine)", "gost89-cnt  - GOST 28147-89 in CNT mode (provided by ccgost engine)", "idea-cbc - IDEA algorithm in CBC mode", "idea-cfb - IDEA in CFB mode", "idea-ecb - IDEA in ECB mode", "idea-ofb - IDEA in OFB mode", "rc2-cbc - 128 bit RC2 in CBC mode", "rc2-cfb - 128 bit RC2 in CFB mode", "rc2-ecb - 128 bit RC2 in ECB mode", "rc2-ofb - 128 bit RC2 in OFB mode", "rc2-64-cbc - 64 bit RC2 in CBC mode", "rc2-40-cbc - 40 bit RC2 in CBC mode", "rc4 - 128 bit RC4", "rc4-64 - 64 bit RC4", "rc4-40 - 40 bit RC4", "rc5-cbc - RC5 cipher in CBC mode", "rc5-cfb - RC5 cipher in CFB mode", "rc5-ecb - RC5 cipher in ECB mode", "rc5-ofb - RC5 cipher in OFB mode", "aes-[128|192|256]-cbc - 128/192/256 bit AES in CBC mode", "aes-[128|192|256]-cfb - 128/192/256 bit AES in 128 bit CFB mode", "aes-[128|192|256]-cfb1 - 128/192/256 bit AES in 1 bit CFB mode", "aes-[128|192|256]-cfb8 - 128/192/256 bit AES in 8 bit CFB mode", "aes-[128|192|256]-ecb - 128/192/256 bit AES in ECB mode", "aes-[128|192|256]-ofb - 128/192/256 bit AES in OFB mode" }));
        tipoAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAlgoritmoActionPerformed(evt);
            }
        });

        bCriptografar.setText("Criptografar");
        bCriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriptografarActionPerformed(evt);
            }
        });

        jButton2.setText("selecionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecionar arquivo a ser criptografado ou decriptografado: ");
        jLabel1.setToolTipText("");

        jLabel2.setText("Algoritimo de criptografia: ");

        jLabel3.setText("Nome arquivo destino: ");

        verificacaoSalt.setSelected(true);
        verificacaoSalt.setText("Usar verificação salt");

        prossDadoBase64.setText("Processar dado na base 64");

        lerChaveArq.setText("Ler chave de arquivo");
        lerChaveArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerChaveArqActionPerformed(evt);
            }
        });

        jLabel4.setText("Password: ");

        jLabel5.setText("Selecionar arquivo com a senha:  ");
        jLabel5.setToolTipText("");

        CaminhoArquivoSenha.setEnabled(false);

        jButton3.setText("selecionar");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        b_decriptografa.setText("Decriptografar");
        b_decriptografa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_decriptografaActionPerformed(evt);
            }
        });

        jButton4.setText("selecionar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lerChaveArq, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaminhoArquivoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(verificacaoSalt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prossDadoBase64, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_decriptografa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caminhoArquivoCriptografa, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(tipoAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeArquivoDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGap(344, 344, 344))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)
                    .addComponent(caminhoArquivoCriptografa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel3)
                    .addComponent(nomeArquivoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lerChaveArq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CaminhoArquivoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificacaoSalt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prossDadoBase64)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_decriptografa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tipoAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAlgoritmoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tipoAlgoritmoActionPerformed

private void bCriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriptografarActionPerformed
// TODO add your handling code here:
    Shell s = new Shell();  
    BufferedReader buf;
    String shell = "openssl ";
    
    if(ValidarForm()){
        String camihnoCript = caminhoArquivoCriptografa.getText();
        String caminhoDestino = nomeArquivoDestino.getText();
        String caminhoArqSenha;
        File fCriptografa = new File(camihnoCript);
        File fDestino = new File(caminhoDestino);
        
       
       switch(tipoAlgoritmo.getSelectedIndex()){
           case 0:
               shell = shell + "base64 ";
               break;
           case 1:
               shell = shell + "bf-cbc ";
               break;
           case 2:
               shell = shell + "bf-cfb ";
               break;
           case 3:
               shell = shell + "bf-ecb ";
               break;
           case 4:
               shell = shell + "bf-ofb ";
               break;
           case 5:
               shell = shell + "cast-cbc ";
               break;
           case 6:
               shell = shell + "cast5-cbc ";
               break;
           case 7:
               shell = shell + "cast5-cfb ";
               break;
           case 8:
               shell = shell + "cast5-ecb ";
               break;
           case 9:
               shell = shell + "cast5-ofb ";
               break;
           case 10:
               shell = shell + "des-cbc ";
               break;
           case 11:
               shell = shell + "des-cfb ";
               break;
           case 12:
               shell = shell + "des-ofb ";
               break;
           case 13:
               shell = shell + "des-ecb ";
               break;
           case 14:
               shell = shell + "des-ede-cbc ";
               break;
           case 15:
               shell = shell + "des-ede ";
               break;
           case 16:
               shell = shell + "des-ede-cfb ";
               break;
           case 17:
               shell = shell + "des-ede-ofb ";
               break;
           case 18:
               shell = shell + "des-ede3-cbc ";
               break;
           case 19:
               shell = shell + "des-ede3 ";
               break;
           case 20:
               shell = shell + "des-ede3-cfb ";
               break;
           case 21:
               shell = shell + "des-ede3-ofb ";
               break;
           case 22:
               shell = shell + "desx ";
               break;
           case 23:
               shell = shell + "gost89 ";
               break;
           case 24:
               shell = shell + "gost89-cnt ";
               break;
           case 25:
               shell = shell + "idea-cbc ";
               break;
           case 26:
               shell = shell + "idea-cfb ";
               break;
           case 27:
               shell = shell + "idea-ecb ";
               break;
           case 28:
               shell = shell + "idea-ofb ";
               break;
           case 29:
               shell = shell + "rc2-cbc ";
               break;
           case 30:
               shell = shell + "rc2-cfb ";
               break;
           case 31:
               shell = shell + "rc2-ecb ";
               break;
           case 32:
               shell = shell + "rc2-ofb ";
               break;
           case 33:
               shell = shell + "rc2-64-cbc ";
               break;
           case 34:
               shell = shell + "rc2-40-cbc ";
               break;
           case 35:
               shell = shell + "rc4 ";
               break;
           case 36:
               shell = shell + "rc4-64 ";
               break;
           case 37:
               shell = shell + "rc4-40 ";
               break;
           case 38:
               shell = shell + "rc5-cbc ";
               break;
           case 39:
               shell = shell + "rc5-cfb ";
               break;
           case 40:
               shell = shell + "rc5-ecb ";
               break;
           case 41:
               shell = shell + "rc5-ofb ";
               break;
           case 42:
               shell = shell + "aes-[128|192|256]-cbc ";
               break;
           case 43:
               shell = shell + "aes-[128|192|256]-cfb ";
               break;
           case 44:
               shell = shell + "aes-[128|192|256]-cfb1 ";
               break;
           case 45:
               shell = shell + "aes-[128|192|256]-cfb8 ";
               break;
           case 46:
               shell = shell + "aes-[128|192|256]-ecb ";
               break;
           case 47:
               shell = shell + "aes-[128|192|256]-ofb ";
               break;
           
       }
       
       shell = shell + "-e ";
       
       if(verificacaoSalt.isSelected()){
           shell = shell + "-salt ";
       }else{
           shell = shell + "-nosalt ";
       }
       
       if(prossDadoBase64.isSelected()){
           shell = shell + "-a ";
       }
       
       
       shell = shell + "-in " + camihnoCript + " ";
       
       shell = shell + "-out " + caminhoDestino + " ";
       
       if(lerChaveArq.isSelected()){
           caminhoArqSenha = CaminhoArquivoSenha.getText();
           shell = shell + "-kfile " + caminhoArqSenha + " ";
       }else{
           shell = shell + "-k " + password.getText() + " ";
       }
       
       s.ExecComandoShell(shell);//execultando o comando
       
       try {
            Thread.sleep(1000);//tem que dar um sleep se ñ o arquivo ñ é gerado acho q 1 a 3 segundos ta bom 1000 = 1s
       } catch (InterruptedException ex) {
            Logger.getLogger(TelaCriptSimetrica.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       /*File fCriptografa = new File(camihnoCript);
        File fDestino = new File(caminhoDestino);*/
        
       if(fDestino.exists() && fDestino.length()>1){//teste para ver se arquivo foi gerado com sucesso.
           JOptionPane.showMessageDialog(null, "Arquivo gerado com Sucesso! " + fDestino.getName() ,"OK" , JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "Erro ao Criptografar " + fCriptografa.getName(),"Alert" , JOptionPane.ERROR_MESSAGE);
       }
       
       
          //JOptionPane.showMessageDialog(null, "item selecionado numero: " + tipoAlgoritmo.getSelectedIndex() + " Shell: " + shell, "Alerta", JOptionPane.ERROR_MESSAGE);
      }
}//GEN-LAST:event_bCriptografarActionPerformed

private void b_decriptografaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_decriptografaActionPerformed
// TODO add your handling code here:
    Shell s = new Shell();  
    BufferedReader buf;
    String shell = "openssl ";
    
    if(ValidarForm()){
        String camihnoCript = caminhoArquivoCriptografa.getText();
        String caminhoDestino = nomeArquivoDestino.getText();
        String caminhoArqSenha;
        File fCriptografa = new File(camihnoCript);
        File fDestino = new File(caminhoDestino);
        
         
       switch(tipoAlgoritmo.getSelectedIndex()){
           case 0:
               shell = shell + "base64 ";
               break;
           case 1:
               shell = shell + "bf-cbc ";
               break;
           case 2:
               shell = shell + "bf-cfb ";
               break;
           case 3:
               shell = shell + "bf-ecb ";
               break;
           case 4:
               shell = shell + "bf-ofb ";
               break;
           case 5:
               shell = shell + "cast-cbc ";
               break;
           case 6:
               shell = shell + "cast5-cbc ";
               break;
           case 7:
               shell = shell + "cast5-cfb ";
               break;
           case 8:
               shell = shell + "cast5-ecb ";
               break;
           case 9:
               shell = shell + "cast5-ofb ";
               break;
           case 10:
               shell = shell + "des-cbc ";
               break;
           case 11:
               shell = shell + "des-cfb ";
               break;
           case 12:
               shell = shell + "des-ofb ";
               break;
           case 13:
               shell = shell + "des-ecb ";
               break;
           case 14:
               shell = shell + "des-ede-cbc ";
               break;
           case 15:
               shell = shell + "des-ede ";
               break;
           case 16:
               shell = shell + "des-ede-cfb ";
               break;
           case 17:
               shell = shell + "des-ede-ofb ";
               break;
           case 18:
               shell = shell + "des-ede3-cbc ";
               break;
           case 19:
               shell = shell + "des-ede3 ";
               break;
           case 20:
               shell = shell + "des-ede3-cfb ";
               break;
           case 21:
               shell = shell + "des-ede3-ofb ";
               break;
           case 22:
               shell = shell + "desx ";
               break;
           case 23:
               shell = shell + "gost89 ";
               break;
           case 24:
               shell = shell + "gost89-cnt ";
               break;
           case 25:
               shell = shell + "idea-cbc ";
               break;
           case 26:
               shell = shell + "idea-cfb ";
               break;
           case 27:
               shell = shell + "idea-ecb ";
               break;
           case 28:
               shell = shell + "idea-ofb ";
               break;
           case 29:
               shell = shell + "rc2-cbc ";
               break;
           case 30:
               shell = shell + "rc2-cfb ";
               break;
           case 31:
               shell = shell + "rc2-ecb ";
               break;
           case 32:
               shell = shell + "rc2-ofb ";
               break;
           case 33:
               shell = shell + "rc2-64-cbc ";
               break;
           case 34:
               shell = shell + "rc2-40-cbc ";
               break;
           case 35:
               shell = shell + "rc4 ";
               break;
           case 36:
               shell = shell + "rc4-64 ";
               break;
           case 37:
               shell = shell + "rc4-40 ";
               break;
           case 38:
               shell = shell + "rc5-cbc ";
               break;
           case 39:
               shell = shell + "rc5-cfb ";
               break;
           case 40:
               shell = shell + "rc5-ecb ";
               break;
           case 41:
               shell = shell + "rc5-ofb ";
               break;
           case 42:
               shell = shell + "aes-[128|192|256]-cbc ";
               break;
           case 43:
               shell = shell + "aes-[128|192|256]-cfb ";
               break;
           case 44:
               shell = shell + "aes-[128|192|256]-cfb1 ";
               break;
           case 45:
               shell = shell + "aes-[128|192|256]-cfb8 ";
               break;
           case 46:
               shell = shell + "aes-[128|192|256]-ecb ";
               break;
           case 47:
               shell = shell + "aes-[128|192|256]-ofb ";
               break;
           
       }
       
       shell = shell + "-d ";
       
       if(verificacaoSalt.isSelected()){
           shell = shell + "-salt ";
       }else{
           shell = shell + "-nosalt ";
       }
       
       if(prossDadoBase64.isSelected()){
           shell = shell + "-a ";
       }
       
       
       shell = shell + "-in " + camihnoCript + " ";
       
       shell = shell + "-out " + caminhoDestino + " ";
       
       if(lerChaveArq.isSelected()){
           caminhoArqSenha = CaminhoArquivoSenha.getText();
           shell = shell + "-kfile " + caminhoArqSenha + " ";
       }else{
           shell = shell + "-k " + password.getText() + " ";
       }
       
       s.ExecComandoShell(shell);//execultando o comando
       
       try {
            Thread.sleep(1000);//tem que dar um sleep se ñ o arquivo ñ é gerado acho q 1 a 3 segundos ta bom 1000 = 1s
       } catch (InterruptedException ex) {
            Logger.getLogger(TelaCriptSimetrica.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       /*File fCriptografa = new File(camihnoCript);
        File fDestino = new File(caminhoDestino);*/
        
       if(fDestino.exists() && fDestino.length()>1){//teste para ver se arquivo foi gerado com sucesso.
           JOptionPane.showMessageDialog(null, "Arquivo gerado com Sucesso! " + fDestino.getName() ,"OK" , JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "Erro ao Criptografar " + fCriptografa.getName(),"Alert" , JOptionPane.ERROR_MESSAGE);
       }
       
       
          //JOptionPane.showMessageDialog(null, "item selecionado numero: " + tipoAlgoritmo.getSelectedIndex() + " Shell: " + shell, "Alerta", JOptionPane.ERROR_MESSAGE);
      }
}//GEN-LAST:event_b_decriptografaActionPerformed

private void lerChaveArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerChaveArqActionPerformed
// TODO add your handling code here:
    //JOptionPane.showMessageDialog(null, "Esta selecionado: " + lerChaveArq.isSelected() , "Alerta", JOptionPane.ERROR_MESSAGE);
    if(lerChaveArq.isSelected()){
        CaminhoArquivoSenha.setEnabled(true);
        jButton3.setEnabled(true);
        password.setText("");
        password.setEnabled(false);
    }else{
        CaminhoArquivoSenha.setEnabled(false);
        jButton3.setEnabled(false);
        password.setEnabled(true);
    }
}//GEN-LAST:event_lerChaveArqActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showOpenDialog(null);  
    
    if (retorno==JFileChooser.APPROVE_OPTION){  
        caminho = abrir.getSelectedFile().getAbsolutePath();
        caminhoArquivoCriptografa.setText(caminho);
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showDialog(null, "salvar");  
    
    if (retorno==JFileChooser.APPROVE_OPTION){  
        caminho = abrir.getSelectedFile().getAbsolutePath();
        nomeArquivoDestino.setText(caminho);
    }
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    JFileChooser abrir = new JFileChooser();
    String caminho;
    int retorno = abrir.showOpenDialog(null);  
    if (retorno==JFileChooser.APPROVE_OPTION){  
        caminho = abrir.getSelectedFile().getAbsolutePath();
        CaminhoArquivoSenha.setText(caminho);
    }
}//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCriptSimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriptSimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriptSimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriptSimetrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaCriptSimetrica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CaminhoArquivoSenha;
    private javax.swing.JButton bCriptografar;
    private javax.swing.JButton b_decriptografa;
    private javax.swing.JTextField caminhoArquivoCriptografa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox lerChaveArq;
    private javax.swing.JTextField nomeArquivoDestino;
    private javax.swing.JTextField password;
    private javax.swing.JCheckBox prossDadoBase64;
    private javax.swing.JComboBox tipoAlgoritmo;
    private javax.swing.JCheckBox verificacaoSalt;
    // End of variables declaration//GEN-END:variables
}
