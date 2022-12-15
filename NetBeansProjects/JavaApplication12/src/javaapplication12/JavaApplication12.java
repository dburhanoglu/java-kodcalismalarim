/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("notunuzu giriniz");
      Scanner s = new Scanner(System.in);
      int i = s.nextInt();
      if(i>=90){
          System.out.println("notunuz aa");
      }
      else if(i>70 && i<90)
      {
          System.out.println("notunuz bb");
      }  
      else 
          System.out.println("fail");

        // TODO code application logic here
    }
    
}
