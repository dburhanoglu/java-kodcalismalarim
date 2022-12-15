
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
public class OgrenciKayit {
    private String ad;
    private int kisaSinav1,kisaSinav2,araSinav,finalSinavi;
    private double toplamPuan;
    private char notu;
    
    public void veriGir(){//verilerin girilmesini sağlayan metot
        Scanner klavye=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        ad=klavye.next();
        System.out.println("sırasıyla kısasınav1ve kısa sınav notlarını gir,entera bas");
        kisaSinav1=klavye.nextInt();
        kisaSinav2=klavye.nextInt();
        System.out.println("arasınav ve final notunuzu giriniz");
        araSinav=klavye.nextInt();
        finalSinavi=klavye.nextInt();
        
        
        
    }
    public void ciktiYaz(){
    System.out.println("öğrenci ismi"+ad);
    System.out.println("toplam puanı ve notu");
    System.out.println(toplamPuan+""+notu);
            
}
    public void setToplam(){
        toplamPuan=(0.25*(kisaSinav1+kisaSinav2)/2)+(0.5*finalSinavi)+(0.25*araSinav);//dikkat edersen
        //doubleları . ile gösteriyorum , ile değil
        
        
        
        
        
        
    }
    public void setNot(){
        if(toplamPuan>=90.0)
        notu='A';
        else if(toplamPuan>=80.0)
                notu='b';
                else if(toplamPuan>=70.0)
                    notu='c';
                else if(toplamPuan>=60.0)
                    notu='D';
                else
                    notu='f';
                
                
                
                
            
    }
}
