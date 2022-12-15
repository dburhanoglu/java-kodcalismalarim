package app43;
public class GarbageCollector{
    public static void main(String []args){
        GarbageCollector gc1=new GarbageCollector();
         GarbageCollector gc2=new GarbageCollector();
    new GarbageCollector();
    gc1=gc2;
    gc1=null;
    System.gc();
    gc2=null;
    Runtime.getRuntime().gc();
    }
}