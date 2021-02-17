package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// Kullanicidan ismini ve soyismini alip aralarinda bir bosluk birakarak
		// isim ve soyismi yazdirin
		// Mehmet , Bulutluoz => Mehmet Bulutluoz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz");
		
		String name=scan.nextLine(); // sadece next() secilirse kullanici birden fazla kelime gise de ilk kelimeyi alir
								// Eger kullanicinin girdigi tum yaziyi almak istersek nextLine() secmeliyiz 

		System.out.println("lutfen soyisminizi giriniz");
		
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname);
		scan.close();
	}

}
