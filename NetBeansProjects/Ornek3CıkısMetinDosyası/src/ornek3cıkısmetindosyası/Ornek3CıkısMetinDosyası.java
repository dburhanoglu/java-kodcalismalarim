/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek3cıkısmetindosyası;

/**
 *
 * @author LENOVO
 */
import java.util.*;
import java.io.*;//tüm girdi ya da çıktı akımı oluşturmakiçin
public class Ornek3CıkısMetinDosyası {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintWriter ciktiAkimi=null;
        String dosya="ornek43.txt";
        try{
            ciktiAkimi=new PrintWriter(new FileOutputStream(dosya));//printwriter sınıfının dosya açacağımızdan 
            //fileoutput stream dosya akımını oluşturduk
            //oluşturduğumuz dosyanın adını da içeri yazdık (adı dosyaydı ya)
            
            
            
            
            
        }
        catch(FileNotFoundException hata)
      { System.out.println("ornek43 dosyası oluşturulamadı");
      System.exit(0);//programdan normal bir şekilde çıkış
      
            
        }
                System.out.println("bir cümle gir");
                Scanner klavye=new Scanner(System.in);
                String cumle=klavye.nextLine();//cümlenin tamamını alsın diye nextLİNE
                        ciktiAkimi.println("klavyeden girdiğiniz cümle budur"+cumle);//cıktı akımı oluşturduk
                        //dosyaya  cumleyi yazan kısım burası
                        ciktiAkimi.println("dosyayı kapatabilirsiniz");
              //her akım kapatılmalıdır
              ciktiAkimi.close();
              System.out.println("girdiğin cümle dosyaya yazıldı");
    }
    
}
