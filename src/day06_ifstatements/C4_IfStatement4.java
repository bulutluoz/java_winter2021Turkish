package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// Kullanicidan gun ismini isteyin 
		// girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
		
		// pazar --> haftasonu,  sali --> hafta ici
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen gun adini giriniz");
		
		String gunAdi= scan.next().toLowerCase();
		
		// Eger String'lerde esitlik sorguluyorsak == kullanmamaliyiz
		// Stringlerde esit olma durumunu sorgulamak icin equals()
		
		if(gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		if(gunAdi.equals("pazartesi") || gunAdi.equals("sali") ||
				gunAdi.equals("carsamba") ||gunAdi.equals("persembe") ||
				gunAdi.equals("cuma")) {
			System.out.println("haftaici");
		}

		// bu kodda gun ismi yanlis yazilmissa olusacak durum yok
		scan.close();
	}

}
