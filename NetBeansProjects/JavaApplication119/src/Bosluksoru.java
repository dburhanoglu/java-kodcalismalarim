

import java.util.Scanner;
import java.util.Vector;

public class Bosluksoru extends Soru  implements Comparable{
	Vector<String> bosluksorular=new Vector();
	Vector<String>boslukcevaplar=new Vector();
	Vector<Integer>boslukzorluklar=new Vector();
	Vector<Integer>boslukpuanlar=new Vector();

	public void Soruekle() {
		

		System.out.println("kaç soru girmek istersiniz");
		Scanner klavye1=new Scanner(System.in);
		int girilen1 =klavye1.nextInt();
		for(int i=0;i<girilen1;i++)
		{ 
			System.out.println("soru  giriniz");
			 Scanner klavye2=new Scanner(System.in);
		    String girilen2=klavye2.nextLine();
		    bosluksorular.add(girilen2);
		    System.out.println("cevabını giriniz");
		     Scanner klavye3=new Scanner(System.in);
		     String girilen3=klavye3.nextLine();
		     boslukcevaplar.add(girilen3);
		     System.out.println("şimdi de zorluğunu girin 1 kolay 2 orta 3 zor");
			 	Scanner klavye4=new Scanner(System.in);
		 		int girilen4=klavye4.nextInt();
		 		boslukzorluklar.add(girilen4);
	            System.out.println("şimdi de bu sorunun puanını giriniz");
	            Scanner klavye5=new Scanner(System.in);
	            int girilen5=klavye5.nextInt();
	            boslukpuanlar.add(girilen5);
		
		
		}
		System.out.println(bosluksorular);
		System.out.println(boslukcevaplar);
		System.out.println(boslukzorluklar);
		System.out.println(boslukpuanlar);
		
	}

	@Override
	public void Sorusil() {
		int j;
		System.out.println("silmek istediğiniz soruda geçen kelimeyi giriniz");
		Scanner klavye5=new Scanner(System.in);
		String girilen5=klavye5.nextLine();
		for( j=0;j<bosluksorular.size();j++) {
			boolean b=bosluksorular.get(j).contains(girilen5);
			if(b==true) {
				System.out.println(bosluksorular.get(j)+"\tbunu sileyim mi?cevabın evetse 1 e bas yoksa baska bir tuşa basabilirsin");
			Scanner klavye6=new Scanner(System.in);
			int c=klavye6.nextInt();
			if(c==1)
				bosluksorular.set(j,null);
			else
				continue;
			}
			 }
							
		System.out.println(bosluksorular);
	}



	protected void dogrucevap() {
		System.out.println("kaçıncı sorunun cevabını istiyorsun?");
			Scanner klavye4=new Scanner(System.in);
		int girilen4=klavye4.nextInt();
			System.out.println(boslukcevaplar.get(girilen4-1));
			
		
		
	}


	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int compareTo(Klasiksoru o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
