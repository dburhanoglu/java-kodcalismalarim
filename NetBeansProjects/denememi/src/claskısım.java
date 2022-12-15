/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class claskısım {
    public int meTot(){
        int toplam=0,kalan,girilen;
        for(int x=1;x<girilen;x++)
        { 
            for(int y=1;y<x; y++){
                kalan=x%y;
                if(kalan==0)
                {
                    toplam=toplam+y;
                }
                       
            }
            if(toplam==x){
                
                System.out.print(x+ " Sayısı   "); 
                toplam=0;
        }
    }
    
}
}