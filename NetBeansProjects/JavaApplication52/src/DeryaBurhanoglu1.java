
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
public class DeryaBurhanoglu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DeyaBurhanoglu2 x=new DeyaBurhanoglu2();//DeryaBurhanoglu2 adlı klastan nesne tanımladım
        Scanner klavye=new Scanner(System.in); // kullanıcının sayı girebilmesi için scanner sınıfı ile klavyeden veri girişi imkanı sağladım
        System.out.println("LÜTFEN BİR SAYI GİRİNİZ");//kulllanıcıdan sayı girmesini istediğim için ekrana ilgili mesajı yazdırdım
        int girilen=klavye.nextInt();//girilen adında integer tanımladım
        System.out.println(x.kaRs(girilen));//kaRs ve erZurum metotlarında x in işlenip  ekrana yazılmasını istedim
        System.out.println(x.erZurum(girilen));
        
        
    }
    
}
