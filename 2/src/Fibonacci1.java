public class Fibonacci1 {
    public int fibonacci1(int sayi) {
        int onceki = 0;
        int simdiki = 1;
        int sonraki = 0;
        for (int i = 0; i < sayi-1; i++) {
            sonraki = simdiki;
            simdiki = onceki + simdiki;
            onceki = sonraki;
        }
        return sonraki;
    }

    public int fibonacci2 (int sayi) {
        if (sayi == 1){
            return 0;
        } else if (sayi == 2 || sayi == 3) {
            return 1;
        } else {
            return fibonacci2(sayi - 1) + fibonacci2(sayi - 2);
        }
    }
}
