package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir tamsayi alin
		// aldiginiz sayidan kucuk olan fibonacci dizisi elemanlarini yazdirin
		// 1 1 2 3 5 8 13 21 34.....
		
		// 1567

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		List<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		
		System.out.println(fibo); // [1, 1]
		
		/*
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi ; i++) {
			
			
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
			
		}
		
		System.out.println(fibo);
		
		*/
		
		int i=2;
		int yeniSayi=0;
		
		while(yeniSayi<sayi) {
			
			yeniSayi=fibo.get(i-2)+fibo.get(i-1);
			
			fibo.add(yeniSayi);
			
			i++;
		}
		
		System.out.println(fibo);
		scan.close();
		
		
	}
}
