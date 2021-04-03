package day43_interfaces;

public interface Interface01 {

	public void motor(); // interface icinde abstract method'lar ve 
						 // OZEL concrete method'lar olabilir
	/*
	 Bir abstract method'un body'si olmadigindan o method'un istenen dinamik ozelligi 
	 nasil gerceklestirecegini bilmemiz mumkun degildir
	 Sadece ne yapacagini biliriz
	 
	 Bu method bize sunu anlatir:
	 Beni inherit eden her concrete class'in dinamik motor ozelligi olmalidir
	 
	 */

	void vites(); // Beni inherit eden her concrete class'in dinamik vites ozelligi olmalidir
	abstract void kasa(); // Beni inherit eden her concrete class'in dinamik kasa ozelligi olmalidir
	
	// Interface'de sadece ABSTRACT, PUBLIC method'lar olur
	// bu iki keyword'u yazsak da yazmasak da Java tum method'lari bu sekilde kabul eder,
	
	// Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	// Bir class sonradan bazi keyword'ler yazilarak interface yapilamaz
	
	String ISIM ="Mustafa"; // Java isim kelimesini italik ve bold yapti
							// Demmek ki tum variable'lar final ve static'tir
	
}
