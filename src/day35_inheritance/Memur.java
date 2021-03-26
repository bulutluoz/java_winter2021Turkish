package day35_inheritance;

public class Memur extends Personel{
	
	public int maas;
	
	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}
	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli constructor calisti");
	}
	


	/*
	 Inheritance'da constructor olusturdugumuzda java'nin otomatik olarak constructor'a 
	 	koydugu super() keyword onemlidir.
	 super() keyword default constructor gibidir. Biz gormesek de calisir, ancak yerine 
	 	baska bir keyword yazarsak etkisiz hale gelir.
	 *** extends varsa yerine birsey yazmadikca super() calisir..... ***
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);

	}








}
