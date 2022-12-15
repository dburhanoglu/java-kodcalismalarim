/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticornek1453;

/**
 *
 * @author LENOVO
 */
public class StaticOrnek {
    public static int staticA;
    public int a;
    public static void setstaticA(int deger)
    {
        staticA=deger;
    }
    public void setA(int deger)
    {
        a=deger;
                
    }
    public int getstaticA(){
        return staticA;
        
    }
    public int getA(){
        return a;
    }
}
