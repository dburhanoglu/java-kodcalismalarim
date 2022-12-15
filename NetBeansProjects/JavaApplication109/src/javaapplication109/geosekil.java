/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;


public abstract class geosekil {
    private String isim;
    public void isimbelirle(String isim)
    {
        this.isim=isim;
        
    }public String isimgetir(){
        return this.isim;
    }
    public abstract double alanhesap();
    
    
}
