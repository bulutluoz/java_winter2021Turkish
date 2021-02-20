package day05_wrapperconcetanationoperators;

public class C2_WrapperClass {

	public static void main(String[] args) {
		// java'da 2 tur data turu vardi
		// primitive sadece value icerir
		// non-primitive data turleri ise deger ve methodlari iceriyordu
		// 
		
		String isim="mehmet";
		
		System.out.println(isim.toUpperCase());
		
		// Wrapper Class : Java'nin primitive data turleri ile bazi methodlari
		//                 kullanabilmemiz icin olusturdugu Class'lardir.
		
		// boolean, char, byte, short, int, long, float, double
		
		// byte sayi=10;
		
		Byte sayi2=11; // ismen primitive data turu ile ayni olan non-primitive datalara wrapper denir
		
		System.out.println(sayi2);

		Byte byteMinSayi = Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		
		// variable olusturmadan direk olarak short'un en kucuk ve en buyuk degerlerini yazdiralim
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		// integer veri turunun wrapper class'i Integer
		// integer en kucuk ve en buyuk degerleri yazdirin
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Boolean, Character, Byte, Short, Integer, Long, Float, Double
		


		
	}

}
