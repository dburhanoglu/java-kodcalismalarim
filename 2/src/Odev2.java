import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Fibonacci1 fibo = new Fibonacci1();

        Scanner klavye = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");

        int sayi = klavye.nextInt();

        System.out.println(fibo.fibonacci1(sayi));
        System.out.println(fibo.fibonacci2(sayi));
    }
}
