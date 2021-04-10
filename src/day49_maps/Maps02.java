package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini 
		// return eden bir method yaziniz
		//  Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3 
		
		
		String input="Hellooo";

		Map<String,Integer> methoddanGelenMap = harfSayisiBul(input);
		
		
		System.out.println(methoddanGelenMap);
		
		
	}

	public static Map<String, Integer> harfSayisiBul(String input) {
		
		String harfler[] = input.split("");
		System.out.println(Arrays.toString(harfler));
		Map<String,Integer> harfKullanimSayisi=new HashMap<>();
		
		for (String each : harfler) {
			
			if (!harfKullanimSayisi.containsKey(each)) {
				
				harfKullanimSayisi.put(each, 1);
			}else {
				
				harfKullanimSayisi.put(each, harfKullanimSayisi.get(each) + 1 );
				
			}		
		}
		
		return harfKullanimSayisi;
	}

}
