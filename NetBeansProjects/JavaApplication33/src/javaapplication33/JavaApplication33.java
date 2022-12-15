/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
/**
 *
 * @author LENOVO
 */
public class JavaApplication33 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dizi1[]={7,4,8,1,4,1,4};
        float dizi2[]=new float[dizi1.length];
        System.out.print("dizi1:[");
        for(int i=0;i<dizi1.length;i++)
        {System.out.println(dizi1[i]+"");
    }
        System.out.print("]");
    
    
}
    { System.out.print("dizi2:[");
    int sayac=0;
    while(sayac<dizi1.length&& dizi1[sayac]!=1)
    { dizi2[sayac]=(float)dizi1[sayac];
    System.out.print(dizi2[sayac++]+"");
    }
    System.out.print("]");
    }
}
