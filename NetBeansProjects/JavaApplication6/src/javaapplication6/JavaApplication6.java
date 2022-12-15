/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author LENOVO
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args) {
    String s = "benim adım sadi evren seker";
   
 int ilkBosluk = s.indexOf(" "); //ilk bosluğun kaçıncı karakterde olduğunu istedim
 String ilkKelime=s.substring(0, ilkBosluk);//ilk kelimenin 0ıncı ve ilkbosluğun olduğu karakterinci arasında aranmasını
 // istedim ve bunun string cinsinden istedim
 int sonBosluk =s.lastIndexOf(" "); //bosluk karakterinin son geçtiği yeri arattım ve bunu int cinsinden sonbosluk değiskenine atadım
String sonKelime =s.substring(sonBosluk);//son kelime değişkeni sonboluğun olduğu karakterden sonra geldiğinden 
System.out.println("ilk bosluk:"+ilkBosluk+ " ilk kelime:" +ilkKelime+" son kelime:"+sonKelime);//ilk boslugu olduğu karakter cinsinden (int)yazdırdım
//

    
    }
    
}
