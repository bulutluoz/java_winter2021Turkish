package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin
		// sayi pozitif ise "sayi pozitif" yazdirin
		// sayi 100'den kucukse "kucuk sayi" yazdirin
		// sayi 1000'den buyukse "buyuk sayi" yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi= scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Sayi pozitif");
		}
		
		if (sayi<100) {
			System.out.println("kucuk sayi");
		}
		
		if (sayi>1000) {
			System.out.println("buyuk sayi");
		}
		
		scan.close();
	}

}
