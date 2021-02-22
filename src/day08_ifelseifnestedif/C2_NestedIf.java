package day08_ifelseifnestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
		// Nested : ic ice
		/*
		 Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
		 yazdiran bir java programi yaziniz
		 Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
		 calisan erkekse 65 yasindan buyukse emekli olabilir. 

		 */

		String cinsiyet="kadin";
		int yas = 59;
		
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		} else if(cinsiyet.equalsIgnoreCase("erkek")&& yas>=65) {
			System.out.println("Emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("emekli olamazsin");
		} else if (cinsiyet.equalsIgnoreCase("kadin")&& yas>=60) {
			System.out.println("Emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("kadin")&& yas<60) {
			System.out.println("emekli olamazsin");
		} else {
			System.out.println("Cinsiyet veya yas tanimsiz");
		}
		
		
		System.out.println("Nested if ile sonuc");
		
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<0) {
				System.out.println("erkek yas negatif olamaz");
			} else if (yas<65){
				System.out.println("Bu yastaki erkek Emekli olamaz");	
			} else {
				System.out.println("bu yastaki erkek emekli olabilir");
			}
			
			
		} else if (cinsiyet.equalsIgnoreCase("Kadin")){

			if(yas<0) {
				System.out.println("kadin yas negatif olamaz");
			} else if(yas<60) {
				System.out.println("bu yastaki kadin Emekli olamaz");	
			}else {
				System.out.println("Bu yastaki kadinemekli olabilir");
			}
						
		}else {
			System.out.println("yazdiginiz cinsiyet sisteme kayitli degil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
