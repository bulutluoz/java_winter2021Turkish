package day13_stringmanipulation;

import java.util.Scanner;

public class C11_Examples4 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
		 * "Sifre basari ile tanimlandi", sartlari saglamazsa "Islem basarisiz,Lutfen
		 * yeni bir sifre girin" yazdirin - Ilk harf buyuk harf olmali - Son harf kucuk
		 * harf olmali - Sifre bosluk icermemeli - Sifre uzunlugu en az 8 karakter
		 * olmali
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Lutfen bir sifre giriniz");
		String sifre = scan.nextLine();
		char ilkHarf = sifre.charAt(0);
		char sonHarf = sifre.charAt(sifre.length() - 1);
		int uzunluk = sifre.length();
		int bosluk = sifre.indexOf(' ');
		/*
		 * System.out.println(ilkHarf); System.out.println(sonHarf);
		 * System.out.println(uzunluk); System.out.println(bosluk);
		 */
		if (ilkHarf >= 'A' && ilkHarf <= 'Z' && sonHarf >= 'a' && sonHarf <= 'z' && bosluk == -1 && uzunluk >= 8) {
			System.out.println("Sifre basari ile tamamlandi");
		} else {
			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
			scan.close();
		}
	}
}