/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication99;

/**
 *
 * @author LENOVO
 */
public class TamZamanlı extends Calisan {
    protected int gunSayisi;
    

    public TamZamanlı(int gunS,String adi) {
        super(adi);
        this.gunSayisi=gunS;
    }
    public int getGunSayisi(){
        return gunSayisi;
    }
    public void setGunSayisi(int gunSayisi){
        this.gunSayisi=gunSayisi;
    }
}
