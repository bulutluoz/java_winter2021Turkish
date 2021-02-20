package day04_matematikselislemlermodulus;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// Kullanicidan 4 basamakli bir sayi alalim ve 
		// sayinin basamaklarini ters sirada yazdiralim
		
		
		// bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz
		// 1. islem en sondaki basamagi elde etmek
		// 2. islem en sondaki basamagi yok etmek
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamkalarini bulmak icin 4 basamakli bir sayi giriniz");

		int sayi=scan.nextInt(); // bu satirdan itibaren elimizde 4 basamkli bir sayi var
		// 4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz 
		// 1.tekrar
		
		int birlerBas= sayi %10;
		sayi /= 10;
		
		// bu satirdan itibaren sayimiz 3 basamakli oldu
		// onlar basamagini bulmak icin 2. Tekrar
		
		int onlarBas = sayi % 10 ;
		sayi/=10 ;
		
		// bu satirdan itibaren sayimiz 2 basamakli
		// 3.Tekrar
		
		int yuzlerBas= sayi%10;
		sayi/=10;
		
		// bu satirdan itibaren sayimiz 1 basmakli 
		int binlerBas=sayi % 10; // burada % islemi yapmak zorunda degiliz 
		
		// tum basamaklar var
		// tum basamaklari yazdiralim
		System.out.println("Birler basmagi : " + birlerBas);
		System.out.println("Onlar basmagi : " + onlarBas);
		System.out.println("Yuzler basmagi : " + yuzlerBas);
		System.out.println("Binler basmagi : " + binlerBas);
		
		
		// sayiyi tersten yazdiralim
		
		System.out.print( birlerBas);
		System.out.print( onlarBas);
		System.out.print( yuzlerBas);
		System.out.println( binlerBas);
		
		// System.out.println(); yukaridaki son print'i println yaparsam 
		// bu satira ihtiyac kalmaz
		
		// sayinin rakamlari toplamini bulalim
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		
		// rakamlari toplamini degil sayilari yanyana yazdirmak istersek
		System.out.println("Yazdiginiz sayinin tersten yazilisi : "+birlerBas+onlarBas+yuzlerBas+binlerBas);
		scan.close();
		
	
	}

}
