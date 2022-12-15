/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametrealanmetinselifadei;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ParametreAlanMetinselifadei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VeriYazdir2 benimNesnem=new VeriYazdir2();
        String ileti;
        int sembolSayisi;
        Scanner klavye=new Scanner(System.in);
        ileti=klavye.next();
        sembolSayisi=benimNesnem.veriYazdir2(ileti);
        System.out.println(sembolSayisi);
        
                
    }
    
}
