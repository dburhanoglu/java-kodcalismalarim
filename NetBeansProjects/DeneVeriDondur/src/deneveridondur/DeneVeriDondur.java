/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneveridondur;

/**
 *
 * @author LENOVO
 */
public class DeneVeriDondur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sembolSayisi;
        VeriDondur eleman=new VeriDondur();
        sembolSayisi=eleman.veriYazdir();
        System.out.println("sembol sayısı"+sembolSayisi);
      
    }
}
public class VeriDondur{
    public int veriYazdir()
    {int say;
    String mesaj="sadece ekrana bu mesajı yazdıralım";
    System.out.println(mesaj);
    say=mesaj.length();
    return say;
    }
}

    
 
