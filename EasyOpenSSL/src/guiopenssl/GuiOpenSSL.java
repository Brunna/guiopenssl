/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiopenssl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 *
 * @author Edviges
 */
public class GuiOpenSSL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{

            Process p = Runtime.getRuntime().exec("md2test.exe");

            BufferedReader buf = new BufferedReader( new InputStreamReader( p.getInputStream() ) ) ;
            String line = new String();
            
            
            while((line = buf.readLine())!= null) 
            {
                System.out.println(line) ;
            }
          
            
        }catch(IllegalAccessError e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }   
        
    } 
    
}
