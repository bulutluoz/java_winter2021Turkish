package day23_statickeyword;

public class Static1 {
	
	static String isim="Mehmet";
	int yas=49;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// static variable'lar olusturulan tum objeler icin gecerlidir (okul adi gibi)
		// mesela bir class'da 1 instance, 1 de static variable olsun
		
		Static1 st1= new Static1();
		Static1 st2= new Static1();
		Static1 st3= new Static1();
		
		st1.isim="Hasan";
		st1.yas=25;
		System.out.println(st1.isim + " " + st1.yas); // Hasan 25
		
		st2.isim="Ayse";
		st2.yas=30;
		System.out.println(st2.isim + " " + st2.yas); // Ayse 30
		System.out.println(st1.isim + " " + st1.yas); // Ayse 25
		
		st3.isim="Alican";
		st3.yas=40;
		System.out.println(st3.isim + " " + st3.yas); // Alican 40
		System.out.println(st2.isim + " " + st2.yas); // Alican 30
		System.out.println(st1.isim + " " + st1.yas); // A 25
		
	}

}
