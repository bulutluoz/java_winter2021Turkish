package day33_encapsulation;

public class Encapsulation02 {
	private String okulIsmi="Yildiz Koleji";
	// Okul isminin baska class'lardan okunmasini ama deger atanamamasini istiyorsak
	// getter() method'u olusturuyoruz
	
	private String tcNo="12345678901";
	@SuppressWarnings("unused")
	private int hesapNo=5554321;
	// Obje olusturularak deger atanip kullanilmasini istedigimiz ama 
	// ilk atadigimiz degerin gorunmemesini istiyorsak setter() method'u kullaniriz
	public int sayi=100;
	
	
	
	public static void main(String[] args) {
		// eger ulasmak istedigim class uyeleri(class member) public degilse baska 
		// package'lerden ulasmak icin extra islem yapmamiz gerekir.
		
		// Yapabilecegimiz islemlerden 1.si Encapsulation (Data saklama)
		// bu class'da kimseyle paylasmak istemedigimiz variable ve method'lar olusturalim
		
		// private yapinca guvenlik konusunu halletmis olduk
		// Ancak class uyeleri'nin private olmasi OOP concept'e aykiri
		
		// Encapsulation class'imizda olusturdugumuz class uylerine 
		// kimlerin ne oranda ulasabilecegini belirlemek icin yapilir
		
	}
	
	@SuppressWarnings("unused")
	private void denemeMethod() {
		System.out.println("Deneme method'u calisti");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

	public String getTcNo() {
		return tcNo;
	}



}
