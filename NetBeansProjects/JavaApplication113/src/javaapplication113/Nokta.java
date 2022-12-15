/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication113;

public class Nokta {
    private float x;
    private float y;
    public Nokta(){
        x=0;
        y=0;
    }

    public Nokta(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Nokta(Nokta copy){
    this.x=copy.getX();
    this.y=copy.getY();
    }
    public float farkiniDondur(Nokta diger){
        float uzaklik= (float) Math.pow((this.getX()-diger.getX())+(this.getY()-diger.getY()),2);


    return (float) Math.sqrt(uzaklik);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Nokta{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
}