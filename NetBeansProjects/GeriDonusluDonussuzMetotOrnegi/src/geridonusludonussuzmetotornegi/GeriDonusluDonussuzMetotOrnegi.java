/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geridonusludonussuzmetotornegi;

/**
 *
 * @author LENOVO
 */
public class GeriDonusluDonussuzMetotOrnegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mesajgoster();
      System.out.println(""+ToplamSonuc()   );
    } 
    static void Mesajgoster(){
    System.out.println("ben geri donüşsüz metodum");
    
    }
    static double ToplamSonuc(){//geri dönüşlü metot
double a=20;
double b=100;
 double c=a+b;
return c;
}
}
