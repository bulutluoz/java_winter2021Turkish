package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		/*
	 	Kullanicidan artik yil olup olmadigini kontrol 									
	 	etmek icin yil girmesini isteyin.
					
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir 
		Kural 2: 4’un kati olmasina ragmen 100 ile 															bolunebilen yillardan sadece 400’un 														kati olan yillar artik yildir 

	 */
	
			Scanner scan =new Scanner (System.in);
			System.out.println("Lutfen yil yaziniz");
			
			int yil = scan.nextInt();
			
			if (yil%100==0) { // 100'e bolunebiliyor
				
				if (yil%400==0) {
					System.out.println("Artik yil");
				} else {
					System.out.println("Artik yil degil");	
				}		
				
			} else { // 100'e bolunemiyor
				
				if (yil%4==0) {
					System.out.println("Artik yil");
				} else {
					System.out.println("Artik yil degil");
				}

			}

			scan.close();
	}

}
