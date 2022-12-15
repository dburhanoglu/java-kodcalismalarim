/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkesirlisayi2020;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TestKesirliSayi2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pay1,pay2,payda1,payda2;
        KesirliSayi2 ilkSayi=new KesirliSayi2();
        KesirliSayi2 ikinciSayi=new KesirliSayi2();
        KesirliSayi2 sayilarToplami=new KesirliSayi2();
        KesirliSayi2 sonSayi=new KesirliSayi2();
        Scanner klavye=new Scanner(System.in);
        System.out.println("birinci sayının pay ve paydasını giriniz");
        pay1=klavye.nextInt();
        payda1=klavye.nextInt();
        ilkSayi.setSayi(pay1,payda1);
                System.out.println("ikinci sayının pay ve paydasını giriniz");
         pay2=klavye.nextInt();
        payda2=klavye.nextInt();
        
        ikinciSayi.setSayi(pay2,payda2);
                sayilarToplami=ilkSayi.Topla(ikinciSayi)
                        sayilarToplami.yazdir();
                        sonSayi.setSayi(6,99);
                        sonSayi.yazdir();
                
    }
    
}
