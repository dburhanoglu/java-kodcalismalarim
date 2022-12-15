/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DeyaBurhanoglu2 {
    public int kaRs(int girilen){ // bir metot oluşturdum
        int a=0;
        int b=0;
        int c=1;
        for(int i=0;i<girilen-1;i++){ //rekürsif olmayıp, iteratif olabilmesi için işlemleri döngü yoluyla yaptırdım
            b=c;
            c=a+b;
            a=b;
         
        }
        return b;
        
    }
    public int erZurum (int girilen){ //başka bir metot oluşturdum 
        switch (girilen) { //0, 1 ve 3 olma durumlarına göre belli değerlerin döndürülmesini istedim
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 1;
            default:
                return erZurum(girilen- 2) + erZurum(girilen- 1); // 0, 1 veya 3 olmadığı durumda f(n)=f(n-1)+f(n-2) formülü ile sonuca gidilmesini istedim
                
              
        }
                        }
       
                   
    }
    
    
    
    

