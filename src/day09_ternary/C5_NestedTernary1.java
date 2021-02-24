package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		// girilen degerlere gore 	dikdorgenin kare olup olmadigini yazdirin.


		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen kontrol icin dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
		// System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
		
		String sonuc = kenar1>0 && kenar2>0 ? 
				       kenar1==kenar2 ? "kare" : "kare degil" : 
				       "gecersiz kenar uzunlugu";
		
		System.out.println(sonuc);
		scan.close();
	}

}
