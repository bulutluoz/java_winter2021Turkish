package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet02 {

	public static void main(String[] args) {
		// 
		Set<String> set1 = new HashSet<>();

		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("Y");
		set1.add("D");

		System.out.println(set1); // [A, B, C, D, F, Y]
		
		set1.clear();
		System.out.println(set1); // []
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		System.out.println(set1); //[A, B, F]
		Set<String> set2 = new HashSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("F");
		
		System.out.println(set2); // [A, B, F]
		
		System.out.println(set1.containsAll(set2)); // true
		
		System.out.println(set1.equals(set2)); // true
		
		System.out.println(set1.removeAll(set2));//true
		// 1 tane bile kesisen bulup silerse true doner, hic silemezse false doner
		System.out.println(set1);
		System.out.println(set2);
		
		
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("D");
		
	
		set1.retainAll(set2); // set1 de calisir, set2'de olan elemanlari tutar ve
							  // set2'de olmayan elemanlari siler
		
		System.out.println(set1);
		System.out.println(set2);
		
		
		
	}

}
