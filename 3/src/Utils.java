import java.util.ArrayList;

public class Utils {
    public void doldur (int[] dizi) {
        for (int i = 0; i < 10; i++) {
            dizi[i] = 11 + (int)(Math.random() * (1500000-11));
            System.out.print(dizi[i] + "\t");
        }
        System.out.println();
    }

    public void armstrong (int[] dizi) {
        String armstronglar = "";
        for (int i = 0; i < 10; i++) {
            int sayi = dizi[i];

            ArrayList<Integer> degerler = basamakDegerleri(sayi);
            int basamakAdedi = degerler.size();
            int armstrongHesap = 0;
            for (int j = 0; j < basamakAdedi; j++) {
                int deger = degerler.get(j);
                armstrongHesap += (int)Math.pow(deger, basamakAdedi);
            }
            if(armstrongHesap == sayi) {
                armstronglar += armstrongHesap + ", ";
            }
        }
        System.out.println("Dizideki armstrong sayılar: " + armstronglar);
    }

    private ArrayList<Integer> basamakDegerleri (int sayi) {
        int basamak = 10;
        ArrayList<Integer> degerler = new ArrayList<Integer>();
        while(basamak <= sayi*10) {
            degerler.add((sayi % basamak) / (basamak / 10));
            basamak *= 10;
        }
        return degerler;
    }

    public void palindromes(int[] dizi) {
        String palindromes = "";
        for (int i = 0; i < dizi.length; i++) {
            if (palindromeCheck(dizi[i])) {
                palindromes += "(" + i + ", "+ dizi[i] + "), ";
            }
        }
        System.out.println("Dizideki palindrome sayılar: " + palindromes);
    }

    private boolean palindromeCheck (int sayi) {
        ArrayList<Integer> basamaklar = basamakDegerleri(sayi);

        for (int i = 0; i < basamaklar.size(); i++) {
            if (basamaklar.get(i) != basamaklar.get(basamaklar.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}