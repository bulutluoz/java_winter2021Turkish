package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_Nestedif4 {

	public static void main(String[] args) {
		/*
		 Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		 Kullanicidan bir sifre girmesini isteyin
		 Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise 		
		 “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		 Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise 	
		 “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

		 */
		
		//1. islem kullanicidan sifreyi alip ilk harfine bak
		// buyuk harfmi yoksa kucuk harf mi ?
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen sifrenizi yaziniz");
		
		char ilkHarf = scan.next().charAt(0) ; // girilen sifrenin ilk karakterini alir
		
		
		if (ilkHarf>='A' && ilkHarf<='Z') { // ilk harf buyuk ise
			if (ilkHarf =='A') {
				System.out.println("sifre gecerli");
			} else {
					
				System.out.println("Sifre gecersiz buyuk harf");
			}
					
		} else if (ilkHarf>='a' && ilkHarf<='z'){ // ilk harf kucuk ise
			
			if (ilkHarf=='z') {
				System.out.println("sifre gecerli");
			} else {
				System.out.println("Sifre gecersiz kucuk harf");	
			}
				
		} else { // ilk harf buyuk harf veya kucuk harf degilse
			
			System.out.println("Sifre gecersiz, lutfen ilk karakteri harf yapiniz");
		}
		
		
		scan.close();
		
		
		

	}

}
