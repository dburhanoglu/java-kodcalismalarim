/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author LENOVO
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fib []=new int[10];
 fib[0] =1 ;
 fib[1] =1;
 int i = 0;
 for(int i =0;i<10;i++)
 { fib[i+2]=fib[i+1]+fib[i]; 
    }
   
 
 }
}
