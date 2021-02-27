package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// Kullanicidan bir String girmesini isteyin
		// girilen String'in son harfini buyuk harf olarak yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz ");
		String str = scan.nextLine().toUpperCase(); 
		
		System.out.println("girdiginiz cumlenin son harfi : " + str.charAt(str.length()-1));
		
		
		// length() method'u girilen String'in uzunlugunu verir
		System.out.println(str);// kullanici ne girdiyse buyuk harfle yazdirir
		
		
		String str2=""; // "Ali " -->4
		System.out.println(str2.length()); // 0
		
		String str3=null; // null hic demek
						  // normalde String'ler "" icine yazilir ama null icin buna gerek yoktur
						  // null case sensitive'dir , dolayisiyla NULL veya Null yazilmaz
						  // null bir deger degildir, sadece hicligi gosteren bir pointer'dir	
		
		System.out.println(str3);
		//System.out.println(str3.length()); // RTE verir
		
		// null deger atanan String ile String manipulation method'lari kullanilamaz
		//System.out.println(str3.equals(str2));
		System.out.println(str.charAt(1)); // indexi 1 olan(bastan ikinci) harfi verir
		//System.out.println(str3.charAt(1)); // RTE

		scan.close();
	}

}
