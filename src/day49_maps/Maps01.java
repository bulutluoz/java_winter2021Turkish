package day49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps01 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(101, "Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1);
		System.out.println(map1.size()); // 3
		
		System.out.println(map1.entrySet());
		
		System.out.println(map1.entrySet().size()); //3
		// entry key,value ikilisinden olusan tum eleman 
		
		Set<Entry<Integer, String>> mapdenSet = map1.entrySet();
		
		for (Entry<Integer, String> each : mapdenSet) {
			
			System.out.println(each);
		}
		
		System.out.println(map1.equals(mapdenSet)); //false
		
		System.out.println(map1.get(101)); // Ali, Can, Java
		
		
		
	}

}
