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
public class Muhendis extends TamZamanlı {
    private String departman;
    public Muhendis(String adi,int gs,String dep){
        super(gs,adi);
        departman=dep;
    }
  /*  Public Muhendis(String adi){
        super(0,adi);
        departman="";
    }*/
}
