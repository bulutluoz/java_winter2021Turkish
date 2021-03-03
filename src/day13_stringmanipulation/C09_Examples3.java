package day13_stringmanipulation;

import java.util.Scanner;

public class C09_Examples3 {

	public static void main(String[] args) {
		/*
		 Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin 
		 ve asagidaki gibi yazdirin
		 isim-soyisim : M***** B*******
		 kart no : **** **** **** 1234

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		System.out.println("Lutfen kart numaranizi giriniz");
		String kartNo=scan.next();
		
		char isimIlkHarf = isim.toUpperCase().charAt(0);
		String isimGeriKalan = isim.substring(1).replaceAll("\\w", "*");
		String soyisimIlkHarf=soyisim.toUpperCase().substring(0, 1);
		String soyisimGeriyeKalan= soyisim.substring(1).replaceAll("\\w", "*");
		String kartNoBasi = "**** **** **** ";
		String kartNoSonu = kartNo.substring(kartNo.length() -4);
		
		System.out.println("isminiz ve soyisminiz : " +  isimIlkHarf + isimGeriKalan +" " +
				           soyisimIlkHarf + soyisimGeriyeKalan);
		System.out.println("Kart No : " + kartNoBasi + kartNoSonu);
		scan.close();
	}

}
