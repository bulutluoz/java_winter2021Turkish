package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str="";
		for (int i = 0; i < 1000 ; i++) {
			str+=i;
		}
		
		// bu kod calistiginda kac tane obje olusur ?
		// 1001 
		// ilk basta 1 tane olusturduk
		// sonra her dongude str'a concatination yapilacak
		// ama String class'i immutable oldugu icin her yeni degeri koymak icin
		// yeni bir String objesi olusturulur ve eski obje'den pointer silinir
		
		// dolayisiyla loop bittiginde str icin 1 tane pointer'in isaret ettigi obje,
		// 1000 tane de hic bir pointer'in israet etmedigi obje heap memory de bulunur.
		
		List<Integer> list = new ArrayList<>();
		// bu satir java'ya yeni bir obje olusturmasini soyluyor
		// Java yeni obje icin yer var mi diye memory'i kontrol eder ve memory kritik seviyede ise
		// Garbage collector'u devreye sokuyor...
		
		// Garbage collector finalize() methodunu calistirir
		// finalize method'u silinecek objeleri isaretler ve 
		// sonra Garbage collector finalized olan objeleri siler.

	}

}
