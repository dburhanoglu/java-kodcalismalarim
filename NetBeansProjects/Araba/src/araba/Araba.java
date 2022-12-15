/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araba;

/**
 *
 * @author LENOVO
 */
public class Araba {
String marka,renk;
void basGaza(){
System.out.println("    vınnnnn");
}
public void yavasla(){
    System.out.println("oha yavaslasana biraz");
}
int hesap(int a,int b){
    return a*b;
    

}
    public static void main(String[] args) {
        Araba sahin=new Araba();
        /*sahin.yavasla();
        sahin.renk="pembiş";*/
        int sonuc=sahin.hesap(2,4);
        System.out.println(""+sonuc);
        
        
    
    }
    
}
