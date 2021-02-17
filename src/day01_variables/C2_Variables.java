package day01_variables;

public class C2_Variables {
	
	public static void main(String[] args) {
		
		int sayi; // ; yazim dilindeki . gibidir. java ;'u gorunce o satirdaki kod yaziliminin bittigini anlar
		sayi=27;
		
		System.out.print(sayi); // eger println degil de print yazarsak yazdirma isleminden
								// sonra alt satira gecmez
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); // println yazinca yazma isleminden sonra alt satira gecer
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi + sayiDouble); // 32.34
		
		System.out.println(sayi + ilkHarf); //27 + 77 =104
		// Eger bir toplama isleminde char degisken kullanilirsa karakterin Ascii degeri ile toplama yapar
			
		
	}
	

}
