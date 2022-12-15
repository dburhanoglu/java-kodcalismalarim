
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
public class deryaBurhanoglu334{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Araligin Üst limitini Giriniz:");// üst limiti belirlemesi için seyirciden sayı istedim
        Scanner giris=new Scanner(System.in);//sayının girişini yapabilmesi için Scanner sınıfını kullandım bu sınıfta giris adında bir nesne tanımladım
        int sayi=giris.nextInt();//sayı adında bir değişken oluşturup giris değişkenini sayıya atadım
               String aranan=":";//aranan adında string tipinde bir değisken tanımladım
                
                
        deryaBurhanoglu muko=new deryaBurhanoglu();//deryaBurhanoglu sınıfından muko adında bir nesne tanımladım
        for(int i=0;i<=sayi;i++){//1 ile girilen sayı arasındaki sayılara bakıp mükel sayıları bulacak bir döngü kurdum
            if(muko.sarma(i+1)){ 
                
               aranan +=(i+1)+"  ";
                
            }
        }
        System.out.println("1 ile "+sayi+" arasındaki Mükemmel Sayılar"+aranan);
        
    }
    
}
