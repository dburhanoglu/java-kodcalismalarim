/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author LENOVO
 */
public class JavaApplication66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f =new File("a.txt");
        try{
            FileReader fr=new FileReader(f);
            int c=fr.read();
            while(c!=-1){
                c=fr.read();
                System.out.print(c);
            } fr.close();
            
                
                        
            }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
