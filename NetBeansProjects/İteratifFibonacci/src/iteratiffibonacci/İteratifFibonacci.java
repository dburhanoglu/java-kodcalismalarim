/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratiffibonacci;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class İteratifFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("bir sayı giriniz");
        Scanner d =new Scanner(System.in);
        int n=d.nextInt();
      DeryaBurhanoglu i=new DeryaBurhanoglu();
       i.fiboNacci();
               
              
    }
    
}
