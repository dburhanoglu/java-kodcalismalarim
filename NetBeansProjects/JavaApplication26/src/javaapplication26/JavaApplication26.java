/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author LENOVO
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double dSayi= Math.random();
     System.out.println("random sayımız"+dSayi);
     int iSayi=(int)(Math.random()*100);
     System.out.println("rastgele seçilen bir int sayi"+iSayi);
     //birle on arası bir sayi seçme
     int iSayi2=(int)(Math.random()*9+1);
     System.out.print(""+iSayi2);
     
    }
    
}
