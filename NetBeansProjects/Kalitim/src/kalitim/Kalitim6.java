/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//dosyanın adını kalitim yaparsan çalışır
package kalitim;
class Sinif1{
    int x,y;
    void degerAta(int a,int b){
        x=a;
        y=b;
    }
}
class sinif2 extends Sinif1
{
int carp(){
return x*y;
}
}
public class Kalitim {

    public static void main(String[] args)
    {
        sinif2 s2=new sinif2();
        s2.degerAta(5,9);
        System.out.println(s2.carp());
    }
    
}
