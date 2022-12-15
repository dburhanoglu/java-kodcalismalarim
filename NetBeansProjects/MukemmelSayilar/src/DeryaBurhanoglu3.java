
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
public class DeryaBurhanoglu3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         {
    Scanner klavye=new Scanner(System.in);
        
        int sayi,toplam=0,kalan;
        System.out.println("Mükemmel sayıların bulunacağı aralığın üst limitini giriniz");
       sayi=klavye.nextInt(); //aralığın üst limitini sayi'ya atadım
       String mukemmeller=","
        DeryaBurhanoglu4 mukemmel= new DeryaBurhanoglu4();
        for(int i=1;i<sayi;i++){
            if(mukemmel.dondurMa(i)){
                mukemmeller+=i+",";
                
            }
        }
        System.out.println("1 ile"+sayi+"arasındaki mükemmel sayılr"+mukemmeller);
   
    } }}
    

