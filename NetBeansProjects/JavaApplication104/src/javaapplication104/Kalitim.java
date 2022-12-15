
package javaapplication104;

 class Sinif1 
 {
    int x,y;
    void degerata(int a,int b)
    {
        x=a;
        y=b;
    }
    
}
class Sinif2 extends Sinif1
{
    int carp()
    {
        return x*y;
    }
}
public class Kalitim
{ public static void main (String [] args){
    Sinif2 s2=new Sinif2();
  s2.degerata(5,9);
    System.out.println(s2.carp());
    
}}