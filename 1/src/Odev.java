import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");

        int sayi = klavye.nextInt();
        String mukemmeller = "";
        MukemmelSayi mukemmel = new MukemmelSayi();

        for (int i = 1; i <= sayi; i++) {
            if (mukemmel.mukemmelMi(i)) {
                mukemmeller += i + ", ";
            }
        }

        System.out.println("1 ile " + sayi + " arasındaki mükemmel sayılar: " + mukemmeller);
    }
}
