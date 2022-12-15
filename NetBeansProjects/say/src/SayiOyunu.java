
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class SayiOyunu {
    //global decleration yaptık 
    int bulunacakSayi;
    int girilenSayi;
    boolean sayiBulundu;
    //1.metot girilen sayıyla bulunan sayıyı karşılaştırır.1.metot bir kontrol metodudur.
    private void buyukKucukGoster(){
        if(girilenSayi>bulunacakSayi)
        {
            System.out.println("girdiğin sayı büyük,daha küçük bir sayı gir");
        } 
        
        else if(girilenSayi<bulunacakSayi){
            System.out.println("girdiğin sayı küçük,daha büyük bir sayi gir");
            
        }
        else{//elseden sonra koşul yok
            System.out.println("sayıyıyı buldun meldacım");
            sayiBulundu=true;//tek = kullandım
            
        }
                
    }// 2.metot main classın erişebildiği ilk classtır ve bu yüzden public kullanıocaz
    public void oyunSorusu(){
        String cevap;
        Scanner klavye=new Scanner(System.in);//local decleration olduğundan sadece bu metodun altında çalışır
        //yani mesela scanner klavyeyi başka metotta aynı adla bile çağırabiliriz
        do{
            oyunOyna(); //bu metot henüz oluşturulmadığı zamanda "//" kullanırız ki hata vermesin
            System.out.println("tekrar oynamak ister misiniz?");
      cevap=klavye.next();// cevap ın tipi string olduğundan next kullandık
        }while(cevap.equalsIgnoreCase("evet"));// eq ign kullanmak girilen cevabın büyük küçük harfli olmasını önemsiz kılar
            System.err.println("iyi günler");
        }
    private void oyunaBasla(){
        bulunacakSayi=(int)(Math.random()*100+1);
        sayiBulundu=false;//sayı bulunmadı diyoruz yani
        //4.metotda girilen sayının kurala uygunluğuna bakarız
        
    }
    private void sayiSor(){
        Scanner klavye2=new Scanner(System.in);
      
               
        do{
            System.out.println("1 ile 100 arası bir sayı giriniz");
            girilenSayi=klavye2.nextInt();
            
        }while((girilenSayi)<1&&(girilenSayi>100));
        
              
        //5.metot tüm bu metotları çağıracak
    } 
    private void oyunOyna(){
   //bilgisayarın bulunacak sayıyı üretmesini isteriz
   oyunaBasla();
  
   do{
       sayiSor();
       buyukKucukGoster();
   }while(!(sayiBulundu));
  
        
    }
    
}
