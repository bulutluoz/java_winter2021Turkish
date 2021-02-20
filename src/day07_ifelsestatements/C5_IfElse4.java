package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// Kullanicidan ucgenin kenar uzunluklarini alin
		// uc kenar esitse "eskenar" yazdirin
		// yoksa "eskenar degil" yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenarlarini girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {
			System.out.println("eskenar degil");
		}
		scan.close();
		
	}

}
