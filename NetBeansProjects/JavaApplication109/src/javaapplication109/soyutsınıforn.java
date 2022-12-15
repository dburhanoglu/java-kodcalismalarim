/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

public class soyutsınıforn {

    public static void main(String[] args) {
       daire d1=new daire();
      ucgen u1=new ucgen();
      d1.bilgi(5.0);
      System.out.println(d1.isimgetir()+":");
      System.out.println(d1.alanhesap()+":");
       
      u1.bilgi(5.0,3.0);
      System.out.println(u1.isimgetir()+":");
      System.out.println(u1.alanhesap()+":");
              
    }
    
}
