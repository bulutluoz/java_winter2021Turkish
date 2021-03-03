package day13_stringmanipulation;

public class C03_StartsWithIsEmpty {

	public static void main(String[] args) {
		
		String str = "Her gun Java olsa";
		
		System.out.println(str.startsWith("H")); // true
		
		System.out.println(str.startsWith("Her ")); // true
		
		System.out.println(str.startsWith("g",4)); // true
		
		System.out.println(str.startsWith("Java",7)); // false
		
		
		System.out.println(str.isEmpty()); // false
		
		String str2="";
		
		System.out.println(str2.isEmpty()); // true
		
		
		String str3=null;  // null bir deger degildir
						   // sadece str3'un hic bir seye esit olmadigini gosteren POINTER'dir
		
		//System.out.println(str3.isEmpty());  // RTE
		
		System.out.println(""+str3);
	}

}
