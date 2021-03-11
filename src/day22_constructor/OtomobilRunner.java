package day22_constructor;

public class OtomobilRunner {

	public static void main(String[] args) {
		
		
		Otomobil oto1 = new Otomobil(); // default constructor kullandik
		oto1.vites("otomatik");

		
		Otomobil oto2 = new Otomobil ("Kirmizi");
		System.out.println(oto2.marka);
	}

}
