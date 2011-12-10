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
import utilites.Shell;

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
        

            Shell s = new Shell();
            File f1 = new File("teste.dtxt");
            File f2 = new File("teste.b64");
            BufferedReader buf;
            String line = new String();
            
            new TelaPrincipal().setVisible(true);
            
            buf = s.ExecComandoShell("openssl des -nosalt -in teste.txt -out teste.b64 -k oi");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                    
            buf = s.ExecComandoShell("openssl des -d -nosalt  -in  teste.b64 -out teste.dtxt -k oi");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            if(f1.exists() && f1.length()>1){
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
