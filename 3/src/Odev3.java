import java.util.ArrayList;

public class Odev3 {
    public static void main(String[] args) {
        int[] sayilar = new int[10];
        Utils methodlar = new Utils();

        methodlar.doldur(sayilar);/*
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }*/
        methodlar.armstrong(sayilar);
        methodlar.palindromes(sayilar);
    }
}
