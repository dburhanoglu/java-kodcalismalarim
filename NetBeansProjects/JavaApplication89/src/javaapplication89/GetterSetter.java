/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

public class GetterSetter {
 private int deger;
 private String ad;
 public int getDeger(){
return deger;
 }
   public void setDeger(int deger){
       this.deger=deger;
   }
   public String getAd(){
       return ad;
   }
   public void setAd(String ad){
       this.ad=ad;
   }
    public static void main(String[] args) {
        GetterSetter n1=new GetterSetter();
        n1.setAd("mehmet");
        System.out.println(n1.getAd());
        n1.setDeger(5);
        System.out.println(n1.getDeger());
    }
    
}
