package day19_dowhileloop;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sayi=0;

		do {

			System.out.println("Lutfen pozitif bir tamsayi giriniz");
			sayi= scan.nextInt();
			
		} while (sayi<=0);

		System.out.println("aferin");

		
		scan.close();
	}

}
