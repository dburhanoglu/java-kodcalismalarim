/*
constroctorda sub classın degiskenlerine deger atma yaptık
 */
package javaapplication104;
public class getset3 {
private int deger;
private String ad;
public int getdeger(){
  return deger;  
}
public void setdeger(int deger){
    this.deger=deger;
}
public String getad(){
    return ad;
}
public void setad(String ad){
    this.ad=ad;
}
public getset3(String adi,int sayi){
    setad(adi);
    setdeger(sayi);
    
}
    
    public static void main(String[] args) {
     getset3 n1=new getset3("ayse",10);
     System.out.println(n1.getad());

    System.out.println(n1.getdeger());
    }
    
}
