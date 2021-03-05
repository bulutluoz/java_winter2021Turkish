package day18_whileloop;

public class C3_WhileLoop2 {

	public static void main(String[] args) {
		// Soru 2 ) For loop ve while Loop kullanarak 3 basamakli pozitif sayilardan 
		// 15, 20 ve 90’na tam bolunebilen sayilari yazdirin. 


		for (int i = 100; i < 1000; i++) {
			
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		// while loop ile yapalim
		
		int sayi=100;
		
		while (sayi<1000) {
			if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
				System.out.print(sayi + " ");
			}
			sayi++;
		}
		
		
		
		
	}

}
