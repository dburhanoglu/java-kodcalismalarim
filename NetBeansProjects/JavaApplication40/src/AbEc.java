
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class AbEc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       veriYolla veri= new veriYolla();
       String ileti;
       Scanner klavye=new Scanner(System.in);
       ileti=klavye.next();
       int sembolSayisi=veri.veriYazdır(ileti);
       System.out.println(sembolSayisi);
               
               
       
        
    }
}
