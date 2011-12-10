/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiopenssl;

import guiopenssl.gui.TelaPrincipal;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilites.Shell;

/**
 *
 * @author Edviges
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
            new TelaPrincipal().setVisible(true); 
    } 
    
}
