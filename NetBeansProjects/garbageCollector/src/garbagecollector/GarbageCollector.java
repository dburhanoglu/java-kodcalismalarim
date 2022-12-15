/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbagecollector;

/**
 *
 * @author LENOVO
 */
public class GarbageCollector {

   
      GarbageCollector(){
        System.out.println("nesne olustu")
    ;}
      protected void finalize(){
          System.out.print("nesne silindi silinirken bu metod çalıstoı");
          
      }
      public static void main(String[]args){
          for(int i=0;i<3;i++){
              GarbageCollector n1=new GarbageCollector();
          }
          Runtime.getRuntime().gc();
      }
    }
    

