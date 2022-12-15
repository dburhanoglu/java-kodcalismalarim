/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkesirlisayi2020;

/**
 *
 * @author LENOVO
 */
public class KesirliSayi2 {
    private int pay;
    private int payda;
    public void setSayi(int pay_x,int payda_x){
        pay=pay_x;
        payda=payda_x;
        
    }
    public void getPay(){
        return pay;
        
    }
    public void getPayda(){
        return payda;
        
    }
    public KesirliSayi2 Topla(KesirliSayi2 sayi1){
        KesirliSayi2 sayi2=new KesirliSayi2();
        sayi2.pay=sayi1.pay*payda+pay*sayi1.payda;
        sayi2.payda=sayi1.payda*payda;
        return sayi2;
        
        
    }
    public void yazdir(){
        System.out.println(pay+"/"+payda);
    }
}
