/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication97;
class sekil{
    int kose,kosegen,icaci;
 sekil(int kose){
     this.kose=kose;
     kosegen=((kose*(kose-3))/2);
     icaci=(180*(kose-2))/kose;       
 }
 
 public String toString(){
     return kose+"DUZGUN GEOMETRİK SEKLİN"+kosegen+icaci+"";
 }
}
public class JavaApplication97 {

    public static void main(String[] args) {
    sekil geometrik=new sekil(3);
    System.out.println(geometrik);
    
    }
    
}
