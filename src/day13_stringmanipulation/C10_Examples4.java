package day13_stringmanipulation;

import java.util.Scanner;

public class C10_Examples4 {
	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
		// yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi Giriniz");
		String isim = scan.next();
		int isimL = isim.length();
		
		System.out.println("Soyadinizi giriniz");
		String soyisim = scan.next();
		int soyisimL = soyisim.length();
		
		if (isimL > soyisimL) {
			System.out.println("Isminiz daha uzun");
		} else if (isimL < soyisimL) {
			System.out.println("Soyisminiz daha uzun");
		} else {
			System.out.println("Isminiz ve soyisminiz esit uzunlukta");
			scan.close();
		}
	
	}
}