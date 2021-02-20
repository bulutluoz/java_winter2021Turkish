package day03_scannerincrementdecrement;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		// double bir degisken olusturalim ve bunu int ve sonra da byte'a cevirin
		
		double numDouble=129.56;
		
		int numInt = (int) numDouble;
		// double'dan integer'a gecerken eger sayida ondalikli bolum varsa
		// Java ondalikli bolumu siler (yok sayar)
		
		System.out.println("integer degisken degeri : " + numInt);
		
		byte numByte= (byte) numInt;
		// daha dar (narrow) bir data tipine cevirirken eger data tipinin sinirindan buyukse saymaya 
		// negatif en kucuk sayidan devam eder, istenen sayiya gelinceye kadar 
		// tekrar tekrar en kucuk negatif sayiya gider
		
		System.out.println("byte degisken degeri : " + numByte);

	}

}
