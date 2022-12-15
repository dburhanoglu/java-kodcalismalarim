/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

/**
 *
 * @author LENOVO
 */
public class ucgen extends geosekil {
    private double yükseklik;
    private double taban;
    public void bilgi(double yükseklik,double taban)
    {
        isimbelirle("ücgen nesnensi");
        this.yükseklik=yükseklik;
        this.taban=taban;
        
    }
 public double alanhesap(){
        return (taban*yükseklik)/2;
        
        
    }
}
