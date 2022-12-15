/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication114;

/**
 *
 * @author LENOVO
 */
//derya burhanoğlu 201913171047
public class nokTa {
    private double x;
    private double y;
    public nokTa(){
        x=0.0;
        y=0.0;
        
    }
    public nokTa(double x,double y){
        this.x=x;
        this.y=y;
        
    }
    public nokTa(nokTa kopya){
        this.x=kopya.getterX();
        this.y=kopya.getterY();
        
    }
    public double getterX(){
        return x;
        
    }
    public void setterX(){
        this.x=x;
    }
    public double getterY(){
        return y;
    }
    public void setterY(){
        this.y=y;
        
    }
    public double farkiniDondur(nokTa diger){
      double a= Math.pow ((this.getterX()-diger.getterX()),2);
             double b=Math.pow((this.getterY()-diger.getterY()),2);
             double uzaklık=Math.sqrt(a+b);
             return uzaklık;
    }
    public String toString(){
        return "nokta :"+x+","+y;
    }
}

    