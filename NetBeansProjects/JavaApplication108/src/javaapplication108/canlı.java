


package javaapplication108;

 public class canlı 
{ public void adsoyle(){
    System.out.println("burası canlı sınıfı");
}   
}
class hayvan extends canlı
{
    public void adsoyle()
    {
        System.out.println("burası hayvan sınıfı");
        
    }
}
class omurgalı extends hayvan
{
    public void adsoyle(){
    System.out.println("burası omurgalı sınıfı ");
}
}
class omurgasız extends hayvan
{
    public void adsoyle(){
        System.out.println("burası omurgasız sınıfı /t");
    }
}
 class calistir{
    public static void main (String[] args)
    {
       
      /*  canlı h=new hayvan();
        h.adsoyle(); */
   /* hayvan h1=new hayvan();
        canlı c=h1;
       hayvan h2=(hayvan)c;
        h1.adsoyle(); */
                
      /*  omurgalı o1=new omurgalı();
        hayvan h3=o1;
        omurgalı o2=(omurgalı)h3;
        o2.adsoyle();*/
       
    }}
