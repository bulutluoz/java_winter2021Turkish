package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2'yi karsilastirir ve 
		// String olarak esit olup olmadiklarina bakar
		// sonuc olarak true veya false döndürür (sonuc)
		
		// bazi methodlarin yaptiklari islem ile döndürdukleri sonuc farkli olabilir
		// bir methoda git ali ismindeki elementi sil deriz, 
		// o da gidip ali'yi bulur ve siler
		// 
		
		String str = "Ali Can";
		String str2= "Ali Can";
		
		// str ile str2'nin esit olup olmadigini yazdirin
		// // esit veya esit degil yazdirin
		
		System.out.println(str.equals(str2)); // true
				

		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");
		
		// Java'da String'ler  case sensitive'dir.(Buyuk kucuk harf duyarlidir. 
		// Bir harf bile farkli olsa Stringler esit olmaz)
		
	}

}
