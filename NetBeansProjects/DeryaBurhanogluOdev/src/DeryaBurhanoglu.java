
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class DeryaBurhanoglu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner klavye=new Scanner(System.in);
       System.out.println("aralığın üst limitini giriniz");
       int sayi=klavye.nextInt();
       String mukemmelSayilar="";
      DeryaBurhanoglu2 mukemmel =new DeryaBurhanoglu2();
       for(int i=1;i<=sayi;i++){
           if(mukemmel.DondurMa(i)){
             mukemmelSayilar+=i+",";
               
           }
       }
         System.out.println("1 ile "+sayi+"arasındaki mukemmel sayılar:"+mukemmelSayilar)      ;
       
       
    }
    
}