/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
     {int N;
     Scanner klavye=new Scanner(System.in); //birşey girilecek
     System.out.println("dizinin elemanlarını giriniz");
     N=klavye.nextInt();//o girilen şey bir n e eşit
     int A[] = new int[N];// n elemanlı bir küme var adı da a
        int i;
     for(i=0;i<N;i++);
     {
         System.out.println("A("+i+")=");
     A[i]=klavye.nextInt();
     }
     
     
     
          
    }
    
}
