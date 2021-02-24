package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , 
		// buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.


		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		
		char harf=scan.next().charAt(0);
		String sonuc = ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')) 
						? ((harf>='a' && harf<='z') )?"ilk harf kucuk harf" : "ilk harf buyuk harf"
						: "gecersiz karakter";
		System.out.println(sonuc);			
		scan.close();
	}

}
