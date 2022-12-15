
package javaapplication101;
public class YapıcılarOverloading{
    
    void method1(){
        System.out.println("cagrıldı");
    }
    void method2(int sayi1){
        System.out.println("parametreli cagrıldı");
    }
    public YapıcılarOverloading(){
        method1();
    }
    public YapıcılarOverloading(int sayi1){
        method2(sayi1);
    }
    public static void main (String [] args){
        YapıcılarOverloading nes1=new YapıcılarOverloading();
         YapıcılarOverloading nes2=new YapıcılarOverloading(10);
        
    }
}