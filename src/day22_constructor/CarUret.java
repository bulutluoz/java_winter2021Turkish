package day22_constructor;

public class CarUret {
	// SORU ...... CONSTRUCTOR BU CLASS'DA NEREDE ? 
	// su anda bu class'da gorunur bir constructor yok
	// bir class olusturuldugunda Java bu class'dan obje utretilecegini bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR'i class'a yerlestirir
	// default constructor parametresizdir dolayisiyla sadece hic bir ozelligi tanimlanamayan 
	// objeler uretir (tisort uret demek gibidir) 
	// default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
	
	// eger biz sonradan bir constructor yazarsak, Java default constructor'i iptal eder
	
	// Bir constructor olusturalim
	public CarUret (){
		
	}
	// kurallar 1- ismi class ile ayni olmalidir (dolayisiyla buyuk harfle baslar)
	// 2- Constructor return type'a sahip degildir
	// 3- constructor isminden sonra mutlaka parantez olur () ama parametre olmasi opsiyoneldir
	// 4- bir constructor olusturuldugunda kimlerin kullanacagini belirlemek icin access modifier yazilir
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	// bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
	// bu class'da olusturulacak objelere ait tum ozellikler olur
	// bu class direk calistirilmayacagi icin main method olmasa da olur
	// (Kaliphane gibidir)

	
	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak " + yakit  + " kullanir");
	}
	
	public void vites(String vites) { // method
		System.out.println("Araba " + vites + " viteslidir");
	}

}
