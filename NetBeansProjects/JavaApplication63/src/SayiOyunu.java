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
    //global decleration yaptık ki bu değişkenleri aşağıda vereceğimiz tüm metotlar tanısın
    int bulunacakSayi;
    int girilenSayi;
    boolean sayiBulundu;
    //1.metyot girilen sayi ile bulunacak sayıyı karşılaştıracak
    private void buyukKucukGoster()
    {
        if(girilenSayi>bulunacakSayi){
            System.err.println("girdiğin sayi büyük dostum daha küçük bir sayı gir");
            
        }
        else if(girilenSayi<bulunacakSayi){
            System.out.println("girdiğin sayi küçük dostum daha büyük bir tane gir");
            
        }
        else{ //dikkatli bak else yazarken () değil{} kullanf
            System.out.println("sayıyı buldun dostum tebrikler");
            sayiBulundu=true;
            
        }
    }
    
    
}
