package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {
	
	// kullanicidan dairenin yaricapini isteyin ve dairenin alanini yazdirin
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("alanini hesaplamak icin dairenin yaricapini girin");
		
		// kullanicidan yaricap istedim, 
		// once kullanicinin girdigi yaricapi icine koyabilecegim bir degisken olusturmaliyim 
		
		double yaricap = scan.nextDouble();
		
		
		System.out.println("dairenin alani= " + 3.14 *yaricap*yaricap);
		scan.close();
	}
}
