/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

/**
 *
 * @author LENOVO
 */
public class Hayvan {
public void nefesal()
{
    System.out.println("nefesmetod");
  }  }
class Surungen extends Hayvan{
    public static void main(String[] args) 
{
       Surungen s=new Surungen();
       s.nefesal();
    }
    
}
