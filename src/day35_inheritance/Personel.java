package day35_inheritance;

public class Personel {
	public String isim;
	public int sayi;
	
	public Personel() { // parametresiz bir cons. olusturdum
		// super(); 
		/*
		 Java'dan yardim alarak bir constructor olusturdugumuzda, 
		 Java constructor'in ilk satirina super(); keyword'unu ekler
		 Eger icinde oldugumuz class bir child class degilse super(); keywordu silinebilir
		 Bugune kadar biz olusturdugumuz constructorlarda hic super(); keyword'u kullanmadik
		 	ancak bizim classlarimiz child class olmadigindan sorun olmadi
		 */
		System.out.println("Personel parametresiz constructor calisti");
	}

	public Personel(String isim, int sayi) { // parametreli bir cons. olusturdum
		//super();
		System.out.println("Personel parametreli constructor calisti");
	}


	

	
	/* 	Eski derslerden hatirlatma
	 	Her class default constructor'a sahiptir. 
		Default constructor'in parametresi yoktur
		Biz parametreli veya parametresiz bir constructor olusturdugumuzda default cons.silinir
		Eger biz sadece 1 tane parametreli cons.olusturursak, Java default olani sildigi icin
			parametresiz cons. kalmaz. 
		Dolayisiyla parametreli bir cons. olusturdugumuzda mutlaka defailt cons. yerine de
			parametresiz bir cons. olusturmamiz gerekir.
	*/
}
