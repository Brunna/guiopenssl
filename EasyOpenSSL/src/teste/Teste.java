/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import guiopenssl.Main;
import guiopenssl.gui.TelaPrincipal;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import guiopenssl.utilities.Shell;

/**
 *
 * @author gabriel
 */
public class Teste {
      
           /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        

            Shell s = new Shell();//classe que fiz com abstração para execultar na shell
            File f1 = new File("teste.dtxt");
            File f2 = new File("teste.b64");
        try {
            // new TelaPrincipal().setVisible(true);//abre tela principal
            BufferedReader GetBufferedReader = s.GetBufferedReader();
        } catch (Exception ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
            s.ExecComandoShell("openssl req  -new -keyout cakey.pem -out careq.pem -passout pass:1234567890");//execultando o comando
            
        try {
            Thread.sleep(1000);//tem que dar um sleep se ñ o arquivo ñ é gerado acho q 1 a 3 segundos ta bom 1000 = 1s
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                    
            s.ExecComandoShell("openssl des -d -nosalt  -in  teste.b64 -out teste.dtxt -k oi");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            if(f1.exists() && f1.length()>1){//teste para ver se arquivo foi gerado com sucesso.
                System.out.println("Aquivo gerado com sucesso!! " + f1.getName());
            }else{
                System.err.println("Erro ao gerar o arquivo!! " + f1.getName());
            }
            
            if(f2.exists() && f2.length()>1){
                System.out.println("Aquivo gerado com sucesso!! " + f2.getName());
            }else{
                System.err.println("Erro ao gerar o arquivo!! " + f2.getName());
            }
            
            
           
        
    } 
}
