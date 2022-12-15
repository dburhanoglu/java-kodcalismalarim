/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char a;
        Scanner klavye =new Scanner(System.in);
        System.out.print("cinsiyet(K/E)--->");
        a=klavye.nextLine().charAt(0);
        switch(a)
        {
            case 'E':
                System.out.println("erkek");
                break;
            case 'k':
                    System.out.println("kadın");
            default:
                    System.out.println("default");
                   
        }
            
    }
    
}
