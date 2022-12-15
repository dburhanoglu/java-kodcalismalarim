/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner klavye = new Scanner(System.in);
int kacKere, zar1, zar2;
System.out.println("Kac kere zar atıyoruz");
kacKere=klavye.nextInt();
for (int i = 0; i < kacKere; i++) {
zar1= ((int)(Math.random()*6)+1);
zar2= ((int)(Math.random()*6)+1);
System.out.println(i+1+ ".atis:["+zar1+ "-"+ zar2+"]");
} 
    }
}
    

