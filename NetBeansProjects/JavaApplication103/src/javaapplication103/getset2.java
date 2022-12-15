
package javaapplication103;

public class getset2 {
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
    
    public static void main(String[] args) {
     getset2 n1=new getset2();
     n1.setad("mehmet");
     System.out.println(n1.getad());
  n1.setdeger(5);
    System.out.println(n1.getdeger());
    }
    
}
