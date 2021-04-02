package day42_abstractclasses;

public abstract class Personel {
	
	// bir class'i abstract yapmak icin class keyword'unden once 
	// abstract yazmak yeterlidir.
	
	// abstract bir class'in icinde variable olabilir mi ?
	// olabilir
	 public String isim = "Yasin";
	 
	 // variable'lar abstract olur mu ?
	 // olmaz...
	 // public abstract int sayi=10;
	 
	 // abstract class'in tum concrete child'lari abstract class'daki 
	 // tum dinamik ozellikleri yani methodlari
	 // override etmek zorundadir.

	 // bir method abstract olur mu ve nasil yapilir ?
	 public abstract void maasHesapla();
	 public abstract void mesaiBilgisi();
	 
	 // Bir abstract class'da concrete method yazilabilir mi ?
	 // Bir abstract class'da abstract ve concrete method'lar olabilir
	 //  concrete child class'lar abstract method'lari override ETMEK ZORUNDADIR ama
	 //  concrete methodlari override etmek istege baglidir.
	 public void ozelSigorta() {
		 System.out.println("Bu personel ozel sigorta kapsamindadir");
	 }
}
