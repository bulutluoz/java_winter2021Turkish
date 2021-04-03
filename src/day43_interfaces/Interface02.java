package day43_interfaces;

public interface Interface02 {
	
	// Soru su : Buradaki default ve static bizim bildigimiz default ve static mi ?
	// cevap : HAYIR
	
	
	public default void deneme() {
		System.out.println("default keyword'lu method calisti");
	}
	
	// bizim bildigimiz default access modifier'di 
	// bir method'da birden fazla access modfier olur mu ? 
	// bizim interface'de olusturdugumuz tum method'lar public'tir
	// interface'de default keyword kullanarak concrete method olusturabiliriz
	// buradaki default keyword'u access modfier degil
	// Java'nin ozel bir cozumudur.
	// Buradaki default keyword basina yazildigi method'un concrete oldugunu belirtir
	
	
	static void deneme2() {
		System.out.println("static keyword'lu method calisti");
	}

	// yukarida default keyword'u icin yazdiklarimiz static icin de gecerlidir.
	
	// static ve default keyword'u kullanarak olusturdugumuz method'lar
	// override edilmek ZORUNDA DEGILDIR
}
