package day13_stringmanipulation;

import java.util.Scanner;

public class C02_EndsWith {

	public static void main(String[] args) {
		//

		String str = "Java'yla hayat ne guzel";

		System.out.println(str.endsWith("zel")); // true

		System.out.println(str.endsWith("ne guzel")); // true

		System.out.println(str.endsWith("zel ")); // false

		// Kullanicidan bir email isteyin
		// eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi
		// yazin"
		// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail
		// adresi" yazsin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen email'inizi giriniz");
		String email = scan.next();

		if (!email.contains("@")) { // basinda ! olunca -> email @ icermiyorsa

			System.out.println("girdiginiz bilgi email degil");

		} else if (!email.contains("@gmail.com")) { //
			System.out.println("lutfen gmail adresi yazin");

		} else if (!email.endsWith("@gmail.com")) {
			System.out.println("gecersiz gmail adresi");

		} else {

			System.out.println("Email'iniz basariyla kaydedildi");
		}

		scan.close();
	}

}
