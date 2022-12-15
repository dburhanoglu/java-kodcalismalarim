/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int N,i;
      System.out.println("aralığın üst limitini giriniz");
      Scanner A =new Scanner(System.in);
        N =A.nextInt();
       for(i=0;i<N;i++)
        
     {
          System.out.println(""+(Math.pow(2,i+2)*(Math.pow(2,i+1)-1)));
       }
      
    }
    
}
