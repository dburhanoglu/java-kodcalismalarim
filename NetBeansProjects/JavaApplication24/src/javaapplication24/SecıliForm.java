/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;


import java.util.Scanner;
import java.util.scanner;


public class SecıliForm
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a;
      String b;
      scanner klavye= new scanner (System.in);
      System.out.print("ayak numaranı gir---->");
      a=klavye.nextLine();
      b= (a>40)?"büyük":"küçük";
      System.out.println(b);
    }