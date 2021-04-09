package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new HashMap<>();
		HashMap<Integer,String> map2 = new HashMap<>();
		
		map1.put(101, "Ali, Can, java");
		map1.put(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1); // {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		
		map2.put(101, "Vehri, Bas, java");
		map2.put(102, "Esra, Coban, SQL");
		
		System.out.println(map2); // {101=Vehri, Bas, java, 102=Esra, Coban, SQL}
		
		map1.putAll(map2);
		System.out.println(map1); //{101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#}
		// Map'e yeni bir Entry eklemek istedigimde, Java key'e bakar
		// ilk map'de eklenecek key varsa o zaman bu key'e ait value, eklenen value ile update olur
		
		map2.put(104, "Omer, Ari, SQL");
		map1.putAll(map2);
		System.out.println(map1);// {101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari, SQL}
		
		
		map1.putIfAbsent(102, "Ahmet, Demir, Java");
		System.out.println(map1); //{101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari, SQL}
		
		map1.putIfAbsent(100, "Ahmet, Demir, Java");
		System.out.println(map1); // {100=Ahmet, Demir, Java, 101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari, SQL}
		
		
		System.out.println(map1.containsKey(101)); // true
		System.out.println(map1.containsValue("Bas")); // false
		System.out.println(map1.containsValue("Vehri, Bas, java")); // true
		// aranan degere tam olarak esit olan bir value varsa true dondurur
		// value icinde gecen kelime veya String'leri bulmaz
		
		
		
		
	}

}
