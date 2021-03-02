package day15_methodcreation;

public class C3_MethodOverloading {
	public static void main(String[] args) {
		// Java da ayni isimle birden fazla method olusturulursa buna overloading denir.
		// Overloading yapabilmek icin Method Signature'larinin farkli olmasi gerekir
		// Method Signature = isim + parametre sayisi + parametre data turu
		// birbirini kapsayan data turleri oldugunda Java en optimum cozumu uretir
		// (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
		// methodu kullanir)
		// Eger kapsayan bir method da bulamazsa Java CTE verir
		toplama(12, 2); //

	}

	public static void toplama(short sayi1, short sayi2) {
		System.out.println("short method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi2, int sayi1) {
		System.out.println("double/integer method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(char char1, char char2) {
		System.out.println("char method sonucu : " + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu : " + (str1 + str2));
	}

}
