/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.io.*;
public class JavaApplication68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintWriter cikisAkimi=null;
        String file="kisisel.txt";
        try{
            cikisAkimi=new PrintWriter(new FileOutputStream(file));
            
        } catch(FileNotFoundException hata){
          System.out.println("dosya oluşturulamamdı");
          System.exit(0);
          
    } for(int i=0;i<3;i++)
    { System.out.println("bir cümle gir");
        Scanner klavye=new Scanner(System.in);
       String cumle=klavye.nextLine();
    cikisAkimi.println(""+cumle);//dosyaya cumleyi yazdıran yani asıl işi yapan bu
        
    System.out.println("klavyeden girdiğin cümle:"+cumle);           }
    
    
    cikisAkimi.close();
    
    
    
}
}