package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulan bir program yazin
		// asal sayi : 1 ve kendisi disinda hic bir pozitif tamsayiya kalansiz bolunmeyen
		
		int sayi=41;
		
		String flag="Asal"; // flag=bayrak bizim istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder
		
		int bolen=2;
		
		while(bolen<sayi) {
			
			if (sayi%bolen==0) {
				flag="Asal sayi degil";			
			}
			bolen++;
		}

		System.out.println(flag);
		
	}

}
