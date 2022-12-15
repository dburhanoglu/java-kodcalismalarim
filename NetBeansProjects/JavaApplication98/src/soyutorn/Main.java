
package soyutorn;


public abstract class GeoSekil {
    private String isim;
    public void isimBel(String isim){
        this.isim=isim;
    }
public String isimGet(){
    return this.isim;
}
public abstract double alanHesap(); 
      
}
public class ucgen extends GeoSekil{
    private double yukseklik;
    private double taban;
    public void bilgi(double yukseklik,double taban){
        isimBel("ucgennesnesi");
        this.yukseklik=yukseklik;
        this.taban=taban;
    }
  public double alanHesap(){
      return(taban*yukseklik)/2;
  }
}
public class daire extends GeoSekil{
    private double yaricap;
    private double PI=Math.PI;
    public void bilgi(double yaricap){
        isimBel("daire nesnesi");
        this.yaricap=yaricap;
        
    }
    public double alanHesap(){
        return PI*Math.sqrt(yaricap);
    }
}
public class soyutorn{
    public static void main(String [] args){
        daire dnes=new daire();
       ucgen unes=new ucgen();
       dnes.bilgi(5.0);
       System.out.println(dnes.isimGet()+":");
        System.out.println(dnes.alanHesap());
        unes.bilgi(3.0, 4.0);
         System.out.println(unes.isimGet()+":");
          System.out.println(unes.alanHesap()+":");
    }
}