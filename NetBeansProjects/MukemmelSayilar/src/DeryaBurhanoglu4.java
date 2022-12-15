/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DeryaBurhanoglu4 {
    
    public int dondurMa(int sayi){
     
       Bolean res= false;
       int bolenletinToplami=0;
       for(i=1;i<=sayi/2;i++){
           if(sayi%i==0){ 
               bolenlerinToplami+=i;
               
           }
       }
if(bolenlerinToplami==sayi) res=true;
return res;
    }
}


