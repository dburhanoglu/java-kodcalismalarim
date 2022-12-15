






public class DeryaBurhanoglu2 {
    public boolean DondurMa (int sayi){
   Boolean a=false;
   int bolenlerinToplami=0;
   for(int i=1;i<=sayi/2;i++){
        if(sayi%i==0){
            bolenlerinToplami+=i;
        }
    }
  if(bolenlerinToplami==sayi)a=true;
  return a;
      
}
}
