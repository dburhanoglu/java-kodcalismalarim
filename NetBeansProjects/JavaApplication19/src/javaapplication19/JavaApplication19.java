/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author LENOVO
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        { if(i==5)
            continue;//yani diyor ki inin 5 olması durumunda döngünün altına o değer için devam etme o değeri atlayarak döngüye devam et
        System.out.println(i);
            }
    
}
    }