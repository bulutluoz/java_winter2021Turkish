package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// OOP concept
		// Object Oriented Programing
		// Bir proje kapsamindaki class'larda olusturulan variable ve method'larin
		// baska class'larda tekrar tekrar yazilmamasi, var oldugu class'dan obje uretilerek
		// bu variable ve method'larin istendigi kadar kullanilmasidir. (reusability)
		// Write Once Reuse Anywhere
		
		// scope6 class'indaki variable ve methodlara ulasmak istiyorum
		// bunun icin Scope6 class'indan obje uretmeliyiz
		
		Scope6 obj1 = new Scope6();
		// esitligin sol tarafi declaration
		// declaration 2 parcadir ilk parca Data turu , ikinci kisim isim 
		// non-primitive'ler icin data turu ayni zaman class ismi olabilir
		// esitligin saginda ise deger, 2 parcadan olusur
		// new keyword'u, ikicisi de constructor 
		// hangi class'dan obje uretmek istersek o class'in constructor'inii kullaniriz
		obj1.num1=10;
		System.out.println(obj1.num1);//10	
		obj1.add();
		
		
		// deneme() method'unu main method icinden cagirabilir miyim ?
		// deneme(); method'u static olmadigi icin main method'dan direk cagrilamaz
		// Bunun yerine icinde oldugumuz class'dan bir obje uretip onun uzerinden 
		// static olmayan method'lari da cagirabiliriz
		Encapsulation01 obj3=new Encapsulation01();
		obj3.deneme();

	}
	
	public void deneme() {
		// Projemiz kapsaminda bulunan tum Class'lardan
		// public variable ve method'lara istedigim yerden obje ureterek ulasabilirim.
		// eger ulasmak istedigim class uyeleri(class member) public degilse baska 
		// package'lerden ulasmak icin extra islem yapmamiz gerekir.
		Scope1 obj2 = new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=15;
		obj2.method();
		
		// Ben istedigim class'dan obje uretip oradaki public class uyelerine ulasabilirim...
	}

}
