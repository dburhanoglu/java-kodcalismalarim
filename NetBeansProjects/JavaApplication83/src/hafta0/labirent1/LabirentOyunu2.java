package hafta0.labirent1;

import java.util.Scanner;

public class LabirentOyunu2 {

	public static int[][] labirent={{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
		{2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
		{2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2},
		{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2},
		{2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2},
		{2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2},
		{2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2},
		{2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2},
		{2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2},
		{2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2},
		{2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2},
		{2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2},
		{2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2},
		{2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2},
		{2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2},
		{2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2},
		{2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2},
		{2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2},
		{2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 4, 2},
		{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}};

	public static Scanner consol = new Scanner (System.in);
	
	public static int adamX = 0, adamY = 0;
	public static int hedefX = 0, hedefY = 0;
	
	public static int toplamAdim = 0;

	
	public static final int YUKARI = 1;
	public static final int ASAGI = 2;
	public static final int SAGA = 3;
	public static final int SOLA = 4;
	public static final int HATALI = 0;
	
	
	public static final int ZEMIN = 1;
	public static final int DUVAR = 2;
	public static final int ADAM = 3;
	public static final int CIKIS = 4;
	
	public static void main(String[] args) {
		
		oyunuIlkle();
		oyunuBaslat();

	}
	
	public static void oyunuIlkle(){

		for (int y = 0; y < labirent.length; y++){
			for(int x = 0; x < labirent[0].length; x++){
				int hucre = labirent[y][x];
				if(hucre == ADAM){
					adamX = x;
					adamY = y;
				}
				if(hucre == CIKIS){
					hedefX = x;
					hedefY = y;
				}
			}
		}
	
	}
	
	public static void oyunuBaslat(){
		while(true){
			sahneyiYazdir();
			int gidilecekYer = kullanicidanYonBilgisiAl();
			adamiHareketEttir(gidilecekYer);
			if(oyunBitti())
				break;
		}
	}

	private static boolean oyunBitti() {
		
		boolean oyunBitti = false;
		
		if(hedefX == adamX && hedefY == adamY){
			System.out.println("Tebrikler! Ã‡Ä±kÄ±ÅŸÄ± buldunuz");
			oyunBitti = true;
		}
		return oyunBitti;
	}

	private static void adamiHareketEttir(int yon) {
		
		switch(yon){
			
			case YUKARI:
				hareketEt(adamX, adamY-1);
				break;
				
			case SOLA:
				hareketEt(adamX-1, adamY);
				break;
	
			case ASAGI:
				hareketEt(adamX, adamY+1);
				break;
			
			case SAGA:
				hareketEt(adamX+1, adamY);				
				break;

		}
	}

	private static void hareketEt(int x, int y) {
		
		if(labirent[y][x] == ZEMIN || labirent[y][x] == CIKIS){
			labirent[adamY][adamX] = ZEMIN; // ÅŸu an ki bulunduÄŸu yeri boÅŸluk olarak belirle
			labirent[y][x] = ADAM; // labirentte adamÄ±n yerini deÄŸiÅŸtir
			adamX = x;
			adamY = y;
			toplamAdim++;
		}
		
	}

	private static int kullanicidanYonBilgisiAl() {
		
		
		System.out.print("YÃ¶n TuÅŸlarÄ± (w = yukarÄ±, s = aÅŸaÄŸÄ±, a = sol, d = saÄŸ), seÃ§iniz: ");
		String secimStr = consol.next();
		
		char secim = secimStr.charAt(0);
		int yon = HATALI;
		
		switch(secim){
			case 'w':
			case 'W': 
				yon = YUKARI;
				break;
				
			case 'a':
			case 'A':
				yon = SOLA;
				break;
				
			case 's':
			case 'S':	
				yon = ASAGI;
				break;
				
			case 'd':
			case 'D':	
				yon = SAGA;
				break;
	
		}

		return yon;
	}

	private static void sahneyiYazdir() {

		System.out.println("-------------------------\n");
		for (int y = 0; y < labirent.length; y++){
			for(int x = 0; x < labirent[0].length; x++){
				int hucre = labirent[y][x];
				
				switch(hucre){
					case ZEMIN: 
						System.out.print(" ");
						break;
					case DUVAR: 
						System.out.print("#");
						break;
					case ADAM:
						System.out.print("ö");
						break;
					case CIKIS: 
						System.out.print((char)169);
						break;
				}
				
			}
			System.out.println("");
		}
		System.out.println("\n Toplam AdÄ±m: "+toplamAdim);
		System.out.println("\n-------------------------\n");
		
	}

}
