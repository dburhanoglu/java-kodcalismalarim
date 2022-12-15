/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

public class daire extends geosekil {
private double yarıcap;
private double pi=Math.PI;
public void bilgi(double yarıcap){
    isimbelirle("dairenesnesi");
    this.yarıcap=yarıcap;
}
    @Override
    public double alanhesap() {
        return pi*Math.sqrt(yarıcap);
        
    }
    
    
}
