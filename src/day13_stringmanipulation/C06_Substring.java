package day13_stringmanipulation;

public class C06_Substring {

	public static void main(String[] args) {
		
		String str= "Her ders Java gibi olsa";
		

		System.out.println(str.substring(10)); // 10.index dahil(inclusive) sonuna kadar tum String
		System.out.println(str.substring(str.length()-10)); //son 10 harfi yazdirin
		
		// ilk 10 karakteri alma
		System.out.println(str.substring(0, 10));// substring(0, 10) yazildiginda 
												// 0 inclusive, 10 exclusive
		// 11.ci karakterden sonuna kadar olan Stringi yazdiralim
		System.out.println(str.substring(10));

		// str'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin
		
		System.out.println("**********" + str.substring(10));
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*") + 
				            str.substring(10));
		
			
		
		 System.out.println(str.substring(10, 10)); //"" baslangic indexi olsun der, ama bitis indexi 
		 											// olmasin der, Java son soyleneni yapar
		 
		 //System.out.println(str.substring(8, 7)); // RTE
		 
		 System.out.println(str.substring(22)); // length()-1 -> son karakter
		 System.out.println(str.substring(23)); // length()   -> bos
		 //System.out.println(str.substring(24)); // length()'den buyuk sayi yazarsak RTE
		 
		 
		// str'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin
		 
		 String str3 = str.substring(0, 10); // str'nin ilk 10 karakterini aldik
		 str3=str3.replaceAll("\\W", "a");
		 System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));
		 
	}

}
