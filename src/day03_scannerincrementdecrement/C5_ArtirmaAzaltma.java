package day03_scannerincrementdecrement;

public class C5_ArtirmaAzaltma {

	public static void main(String[] args) {
		
		int num = 15;
		
		// bir sayiyi 2 artirmak istersek sayiyi iki ile toplariz
		
		int num2 = num + 2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		num = num+5; // esitligin solunda num yazdigimizda esitligin sagindaki islemde olusan sonuc num 
					// num variable'ina atanir. bu satirdan SONRA num=20 dir
		
		System.out.println("16.satirdan sonra num = " + num);
		
		System.out.println(num+12); // 32
		
		// bir sayiyi artirmak (increment) istersek o sayiya istedigimiz sayiyi ekler ve sonucu
		// variable'a atariz
		
		// num'i 8 artirin
		
		num = num+8; // num=28
		
		// num ' 5 artirin 
		
		num += 5; // num=33
		
		System.out.println("Javanin pratik artirisindan sonra num= " + num);
		
		// num'1 10 artiralim
		
		num +=10; // num =43
		
		// num'i 1 artirin
		
		//num = num + 1 ;
		num+=1; // num=44
		
		// sadece 1 artirmaya ozel olarak Java pratik method
		
		num++; // num=45
		
		System.out.println("num'in son hali : " + num);
		
		
		
	}

}
