/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiopenssl.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author gabriel
 */
public class Shell {
    private Runtime run;
    private Process pros;
    private BufferedReader br;
    private BufferedWriter bw;
    private Boolean execultou;
    
    public Shell(){
        run = Runtime.getRuntime();
        execultou = false;
    }
    
    public Boolean ExecComandoShell(String s) {
        
        try{
            pros = this.run.exec(s);
            OutputStream stdout = pros.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(stdout);
            this.bw = new BufferedWriter(osw);
            
            InputStream stdin = pros.getInputStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            this.br = new BufferedReader(isr);
        
        }catch(IllegalAccessError e){
            e.printStackTrace();
            return false;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        execultou = true;
       return true;
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
    
    public BufferedReader GetBufferedReader() throws Exception{
        if(!execultou){
            throw new Exception("Execute ExecComandoShell primeiro!");
        }
        return this.br;
    }
    
    public BufferedWriter GetbufferWrite() throws Exception{
        
        if(!execultou){
            throw new Exception("Execute ExecComandoShell primeiro!");
        }
        
        return this.bw;
    
    }
}
