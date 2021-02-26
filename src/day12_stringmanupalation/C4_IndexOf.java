package day12_stringmanupalation;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() methodu bize istedigimiz karakter(lerin) indexini dondurur
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6)); // g
		
		System.out.println("char arama " + str.indexOf('g')); // 6
		
		System.out.println("String arama " + str.indexOf("g")); // 6
		
		System.out.println("String kelime arama " + str.indexOf("is")); // i->12 s->13  // 12
		
		System.out.println("birden fazla varsa " + str.indexOf('i')); // ilk buldugunun index'ini 12
		
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4)); // bas. index'i inclusive
		
		System.out.println("olmayan harf " + str.indexOf("dert"));// 
		

	}

}
