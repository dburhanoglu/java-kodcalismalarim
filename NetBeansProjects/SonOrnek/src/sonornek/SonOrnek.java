/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonornek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SonOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintWriter ciktiAkimi=null;
        String dosya="ornek43.txt";
        try{ ciktiAkimi=new PrintWriter(new FileOutputStream(dosya));
        }
        catch(FileNotFoundException hata){
            System.out.println("dosya oluşturulamadı");
            System.exit(0);
           
        }System.out.print("cümle gir");
        Scanner klavye=new Scanner(System.in);
        String cümle=klavye.nextLine();
        ciktiAkimi.println(""+cümle);
        ciktiAkimi.close();
                
    }
    
}
