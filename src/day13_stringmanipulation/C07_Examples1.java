package day13_stringmanipulation;

import java.util.Scanner;

public class C07_Examples1 {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("4 harfli bir kelime giriniz");
		String str = scan.nextLine();
		
		if (str.length()!=4) {
			
			System.out.println("Lutfen 4 karakterli bir kelime giriniz");
		} else {

			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));
		}
		scan.close();
	}

}
