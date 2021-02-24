package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP (Very Important Person) kisaltmasinda hangi harfin anlamini
		// istedigi soralim
		// girilen harfin aciklamasini yazdiralim

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen harf giriniz");

		char harf = scan.next().charAt(0);

		switch (harf) {
		case 'v':
		case 'V':
			System.out.println("Very");
			break;
		case 'I':
		case 'i':	
			System.out.println("Important");
			break;
		case 'P':
		case 'p':
			System.out.println("Person");
			break;
		default:
			System.out.println("gecersiz harf");
		}
		
		// Kullanicinin birden fazla harf girmesini sorun olarak kabul ediyorsaniz
		// ve bunu hata olarak kullaniciya bildirmek istiyorsaniz
		
		System.out.println("Lütfen harf giriniz");
		String str = scan.next();
		switch (str) {
		case "v":
		case "V":
			System.out.println("Very");
			break;
		case "I":
		case "i":	
			System.out.println("Important");
			break;
		case "P":
		case "p":
			System.out.println("Person");
			break;
		default:
			System.out.println("gecersiz harf");
		}
		scan.close();
	}
}
