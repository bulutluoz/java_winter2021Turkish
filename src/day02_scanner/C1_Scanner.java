package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// Scanner ile kullanicidan bilgi alabiliriz
		// 3 adimla scanner islemini gerceklestiriyoruz
		
		// 1. adim Scanner objesi olusturacagiz
		
		Scanner scan = new Scanner(System.in);
		
		// new : Java da ne zaman new kelimesini gorseni yeni bir object olusturuluyor demektir
		// parantezin icine yazilan degerlere parametre diyoruz ve Scanner icin System.in yazmamiz gerekir
		// Bir kod yazdigimizda kodun altinda kirmizi cizgi olusuyorsa veya satir numarasi
		// olan kisimda kirmizi X olusuyorsa bir seyler yanlis demektir 
		// java.util java'nin bizim icin hazirladigi bir kutuphanedir, ihtiyacimiz oldugunda ihtiyacimiz olan kodlari 
		// class'a import etmemiz yeterlidir
		// scan olusturdugumuz Scanner objesine verdigimiz isimdir. farkli isimler de verebiliriz
		// ancak scan ismi tum programcilar tarafindan kullanilan bir isimdir
		// kodumuzun anlasilabilir ve rahat okunabiilir olmasi icin scan ismini kullanmamiz tavsiye edilir
		
		
		// 2. adim kullaniciya bir mesaj yazin 
		System.out.println("Karenin bir kenar uzunlugunu girin");
		
		// 3.adim kullanicinin konsola girdigi degeri programimiza alacagiz
		//  ve bir variable olusturup bu degeri atayacagiz
		// kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir sayi da girebilir, 
		// buyuk bir sayi da yazabilir, tam sayi da yazabilir, virgullu sayi da yazabilir
		
		double kenar=scan.nextDouble();
		
		
		System.out.println("girdiginiz kenar uzunluguna sahip karenin alani= "+kenar*kenar);
		//5.2 *5.2 = 27.04
		scan.close();
	}

}
