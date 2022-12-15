/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticornek1453;

/**
 *
 * @author LENOVO
 */
public class StaticOrnek1453 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticOrnek s1=new StaticOrnek();
        StaticOrnek s2=new StaticOrnek();
        StaticOrnek.setstaticA(5);
        s1.setA(10);
        s2.setA(20);
        System.out.println("s1 nesnesinin statcicA değeri:"+s1.getstaticA());
        System.out.println("s1 nesnesinin a değeri:"+s1.getA());
        System.out.println("s2 nesnesinin staticAdegeri:"+s2.getstaticA());
        System.out.println("s2 nesnesinin a degeri:"+s2.getA());
        
      //  s1. //staticA static tanımlandığı için nesneden bağımsızdır.bu nedenle yaznızca sınıf
                //ismi ile kullanılır s1.setstaticA diyip ullannamayız
                
                
    }
    
}
