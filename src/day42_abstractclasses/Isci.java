package day42_abstractclasses;

public class Isci extends Personel{

	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.maasHesapla(); // isciler icin maas 5000 tl
		isci1.mesaiBilgisi(); // isciler gunluk 8 saat calisir
		isci1.isim="Rumeysa"; // abstract parent class'daki variable'lari istersem kullanabilirim
		System.out.println(isci1.isim); // Rumeysa
		// System.out.println(isim); // 
		isci1.ozelSigorta(); // abstract parent class'daki concrete method'u istersem kullanirim
							 // Bu personel ozel sigorta kapsamindadir
							 // Bu method'u override etmedik ama parent-child iliskisi ile kullanabildik
	}

	@Override
	public void maasHesapla() {
		// parent class'daki abstract method'u implement (uyarlama) etti
		// 1- sen abstract bir class'i parent edindiysen mutlaka oradaki abstract method'u
	    //    implement etmelisin
		// 2- parent class'daki method'da body olmadigi icin onu kullanmanin anlami yok
		//    biz child class'da body olan method (concrete) kullanip islem yapmaliyiz
		System.out.println("isciler icin maas 5000 tl ");
 		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("isciler gunluk 8 saat calisir");
		
	}

}
