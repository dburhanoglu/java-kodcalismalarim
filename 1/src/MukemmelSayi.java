import java.util.ArrayList;

public class MukemmelSayi {

    public boolean mukemmelMi (int sayi) {
        Boolean res = false;

        int bolenlerinToplami = 0;

        for (int i = 1; i <= sayi/2; i++) {
            if (sayi%i == 0) {
                bolenlerinToplami += i;
            }
        }
        if(bolenlerinToplami == sayi) res = true;

        return res;
    }
}
