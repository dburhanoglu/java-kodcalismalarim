/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefon;
class telefon{
    public telefon()
    {
        System.out.println("twlfon sınıfının yapıcısı");
    }}
    class akilliTelefon extends telefon{
        public akilliTelefon(){
            System.out.println("sub classın constroctorı");
        }
    }
class cepTelefonu extends telefon{
    public cepTelefonu(){
        System.out.println("ceeptelinki");
    }
}
class Nokia extends cepTelefonu{
    public Nokia(){
        System.out.println("nokininki");
    }
}
public class calistirma{
    public static void main(String[] args) {
    Nokia n1=new Nokia();   
    }
    
}
