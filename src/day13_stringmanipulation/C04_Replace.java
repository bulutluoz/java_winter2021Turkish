package day13_stringmanipulation;

import java.util.Scanner;

public class C04_Replace {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin 
		// cumledeki tum bosluklari silin ve
		// tum a'larin yerine e yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir cumle giriniz");
		String str = scan.nextLine();
		
		str=str.replace(" ", "");
		str=str.replace("a", "e");
		
		System.out.println(str); //atama yapmazsaniz, manipulations str'i degistirmez
		// Eger atama yaparsak str kalici olarak degistigi icin biz bir daha orijinal str'a ulasamayiz
		// bunun icin kullanicidan aldigimiz str'a degil yeni bir Stringe atamak daha mantiklidir
		
		System.out.println("Lutfen bir cumle daha giriniz");
		String str2 = scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace('a', 'e'));
		
		//hem a hem de e nin yerine i yazalim
		System.out.println(str2.replace("a", "i").replace('e', 'i'));
		
		// hem a hem de e nin yerine i yazalim buyuk kucuk harf gozetmeksizin
		System.out.println(str2.toLowerCase().replace("a", "i").replace("e", "i"));
		scan.close();
	}

}
