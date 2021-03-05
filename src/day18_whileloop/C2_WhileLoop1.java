package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// While : iken, oldugu surece
		// 10'dan 30'a kadar olan sayilardan 4 ile bolunebilenleri 
		// aralarinda bir bosluk olacak sekilde yanyana yazdirin
		
		// once for loop ile yapalim
		
		for (int i = 10; i <= 30; i++) {
			
			if (i%4==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		// aynisini while loop ile yapalim
		
		int sayi=10; // 1.sarti gerceklestirdim (Baslangic degeri)
		
		while (sayi<=30) {  // 2.sarti gerceklestirdim (Bitis kosulu)
			
			if (sayi%4==0) {
				System.out.print(sayi + " ");
			}
		
		sayi++; //3.sarti gerceklestirdim (degisim degeri)	
		}

	}

}
