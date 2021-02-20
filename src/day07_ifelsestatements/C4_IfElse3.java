package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullanicidan yasini sorun
		// yas 65 veya buyukse "emekli olabilirsin" yoksa "emekli olamazsin" yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli Olabilirsin");
		} else {
			System.out.println("Emekli olamazsin");
		}
		scan.close();
	}

}
