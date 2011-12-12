/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilites;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gabriel
 */
public class Shell {
    private Runtime run;
    private Process pros;
    private BufferedReader buf;
    
    public Shell(){
        run = Runtime.getRuntime();
    }
    
    public BufferedReader ExecComandoShell(String s) {
        
        try{
            pros = this.run.exec(s);
            buf = new BufferedReader( new InputStreamReader( pros.getInputStream() ) ) ;
              
        
        }catch(IllegalAccessError e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return buf;
    }
    
    public Runtime GetRun(){
        return run;
    }
    
    public void SetRun(Runtime r){
        run = r;
    }
    
    public Process GetProcess(){
        return pros;
    }
    
    public void SetProcess(Process p){
        pros = p;
    }
}
