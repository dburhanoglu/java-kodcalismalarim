
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */

   public class deryaBurhanoglu888 {

   public static int A[] = new int[10];//10 elemanlı bir dizi tanımladım A adında

  
    
    public void kadayıf() {
        Random R = new Random();
        
        for (int i = 0; i < 10; i++) {//10 adet sayı seçilmesi için döngüyü 10 kez döndürdüm 
            
            int sayi = 11 + (int)(Math.random() * (1500000-11));//math.random metodunu kullanarak 11-1500000 aralığından int tipinde bir sayı seçtirdim(döngü 10 kere döneceğinden toplamda 10 sayı seçtiriyorum)
            A[i] = sayi;  // ve bunu int tipinde bir sayi değişkenine atıyorum.Sayi değişkenini A[i] ye atıyorum ki örneğin 6. eleman=3456 olabilsin
            System.out.print(A[i] +" ");//A[i] değişkenini ekrana yazdırıyorum ve araya da boşluk koyuyorum ki sayıları ayırt edebilelim
            
        }
        
    }
   }