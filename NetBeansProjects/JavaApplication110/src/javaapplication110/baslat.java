/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication110;

abstract class soyutsınıf{
    abstract public void goster();
    public soyutsınıf(){
        System.out.println("burası soyut s.yapıcısı");
    }
    public void metod()
    {System.out.println("soyut sınıfa ait normal metot");
    
    }
    public static void metod2(){
        System.out.println("soyut sınıfa ait static normal metod");
    }
}class altsınıf1 extends soyutsınıf{
    public void goster(){
        System.out.println("burası altsınıf1");
    }
}
class altsınıf2 extends soyutsınıf{
    public void goster(){
        System.out.println("burası altsınıf2");   
    }
}public class baslat{
    public static void main (String [] args){
        altsınıf1 a1=new altsınıf1();
         altsınıf2 a2=new altsınıf2();
         a1.goster();
         a2.goster();
         soyutsınıf s1[]=new soyutsınıf[1];
         s1[0]=a1;
         s1[0].metod();
         soyutsınıf.metod2();
    }
}