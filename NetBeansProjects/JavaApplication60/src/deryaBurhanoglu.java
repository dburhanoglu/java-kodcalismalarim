/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class deryaBurhanoglu{
    public boolean sarma(int sayi){//sarma adında bir metot tanımladım
        
        boolean sonuc=false;
        int bolenlerTop=0;   
        for(int i=1;i<=sayi/2;i++){//for döngüsü oluşturup her dönüşte i yi arttırdım         //
            if(sayi%i==0){ //sayının modunun değerinin 0 olması koşulunu istedim              //   BUNLARI UYGULAYARAK SAYİYİ BÖLENLERİNE AYRDIM
                bolenlerTop+=i;//koşul sağlandığı durumda bolenlerTop değişkeni i kadar artsın dedim //
                
            }
                
        } 
        if(bolenlerTop==sayi) 
            sonuc=true;//if koşulunun içindeki eşitlik doğruysa sonuc=true olsun istedim
        return sonuc;//sonucu döndürdüm
    }
    
}
