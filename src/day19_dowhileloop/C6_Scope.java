package day19_dowhileloop;

public class C6_Scope {
	// Bir Class icerisinde olusturulan variable'larin nerede gecerli oldugu
	// ve nereden kullanilabildigini o variable'in Scope'u belirler.
	// google Java'da scope nedir ? 

	public static void main(String[] args) {
		int sayi=10;

		denemeMethod();
		sayi++;
		System.out.println(sayi);
		//System.out.println(isim);
	}

	
	public static void denemeMethod() {
		// sayi=20;
		String isim="Mehmet";
		System.out.println(isim);
	}
	
	
	
	

}
