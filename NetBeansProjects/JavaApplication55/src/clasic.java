/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class clasic {
    public void metot(int sayi){
 
        for(int x=1;x<sayi;x++){ //istenilen aralığa kadar sayıları tek tek 1 den başlatarak seçiyoruz 
            for(int y=1;y<x;y++){ /*her seçilen sayıyı kendisinden 1 eksiğine kadar başka bir değişkenle getiriyoruz*/
                                                    /*örneğin 6 ise 5e kadar getiriyoruz*/ 
                kalan=x%y; //sayıların moduna bakıyoruz
                if(kalan==0){//eğer modları sıfır ise toplamı bölen sayı ile topluyoruz
                    
                    toplam=toplam+y;
                }
                
                }
            if(toplam==x){// eğer toplam sayiya eşit oluyor ise o sayı mükemmel bir sayıdır
                
                System.out.print(x+ " Sayısı   ");
            }
            toplam=0;
    }
}
}
