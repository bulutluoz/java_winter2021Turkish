package day45_collections;

import java.util.LinkedList;

public class C4_LinkedList04 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [A, B]
		
		ll1.contains("A"); //true veya false doner
		System.out.println(ll1.contains("A")); // true
		
		LinkedList<String> ll2 = new LinkedList<>();

		ll2.add("A");
		ll2.add("B");
		ll2.add("C");
		ll2.add("D");
		System.out.println(ll2); // [A, B, C, D]
		
		System.out.println(ll2.containsAll(ll1)); // true
		System.out.println(ll1.containsAll(ll2)); // false
		
		System.out.println(ll2.get(2)); // C index'i 2 olan elemani getirir
		System.out.println(ll2.getFirst()); // A
		System.out.println(ll2.getLast()); // D
		
		
		
	}

}
