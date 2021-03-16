package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(10);
		
		// equals() methodu 2 listeyi hem elemanlar hemn de elemanlarin index'leri ile karsilastirir
		// hem elemanlar hem de indexler esit ise true doner, yoksa false doner
		System.out.println(list1.equals(list2)); // false
		
		Collections.sort(list1); // [10,20]
		Collections.sort(list2); // [10,20]
		System.out.println(list1.equals(list2)); // true
		
		
		list1.clear();
		System.out.println(list1); // []
		
		
		
		

	}

}
