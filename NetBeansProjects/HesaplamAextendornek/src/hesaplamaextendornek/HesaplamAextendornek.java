/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplamaextendornek;

/**
 *
 * @author LENOVO
 */
public class HesaplamAextendornek extends CalculationGercek {

    public void carpma (int x, int y)
    {
        sonuc=x*y;
        System.out.println("iki sayının carpımı"+sonuc);
        
    }
    public void bolme(int x,int y){
        sonuc=x/y;
        System.out.println("iki sayının bölümü"+sonuc);
            
    }
    {
        int x;
        int y;
    sonuc = x*y;
    System.out.println("iki sayının çarpımı"+sonuc);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a ;
        int b;
         HesaplamAextendornek uzaktanHesaplama=new  HesaplamAextendornek();//clasla aynı ad package le değil
        
        uzaktanHesaplama.Toplama( a,b);
        uzaktanHesaplama.cıkarma(a, b);
        uzaktanHesaplama.carpma(a, b);
        uzaktanHesaplama.bolme(a, b);
        
    }
    
}
