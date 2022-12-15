/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication106;

 class A{
    int x,y;
    A(int i,int j){
        x=i;
        y=j;
    }
    void yazdir()
    {System.out.println("x ve y degerleri"+x+""+y);
    }
}
class B extends A{
    int z;
    B(int i,int j,int k){
        super(i,j);
        z=k;
    }
    void yazdir(String yazi){
        System.out.println(yazi+z);
    }
}class calistir
{  public static void main(String[] args)
{
    B nesne =new B(6,1,8); //b nin const ınıa bu degerler yollanıyor
   nesne.yazdir("znin degeri");
    nesne.yazdir();
}
    
}
