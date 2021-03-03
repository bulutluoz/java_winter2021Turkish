package day15_methodcreation;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdiralim
		/*
		System.out.println("Hello World"); //1
		System.out.println("Hello World"); 
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World"); // 5
		*/
		
		// bunun yerine loop kullaniyoruz
		// ne yapacagimizi java'ya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		// Tum loop'larda 3 seyi yazmak zorundayiz
		// 1) baslangic degeri 
		// 2) bitis degeri
		// 3) artis degeri
		
		
		for(int i=100 ; i<102 ; i++) {
			
			System.out.println(i + " Hello World");
			
		}
		
		//System.out.println("kod calisti");
		// Not : Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
		// Not : loop'da artis degeri pozitif oldugu gibi negatif de olabilir i--
		// Not : Artis degeri 1 olmak zorunda degil, farkli da olabilir
		// Not : Eger Loop'un sarti hic true olmazsa loop body hic devreye girmez

	}

}
