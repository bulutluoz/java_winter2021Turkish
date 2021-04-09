package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		// queue bir interface'dir dolayisiyla obje uretemeyiz
		// Child class'i olan PriorityQueue ve LinkedList constructor secimine 
		// gore olusturdugumuz queue'nun davranislari degisir
		
		Queue<String> k1=new PriorityQueue<>();
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		
		System.out.println(k1); // [A, C, M, D]
		// Queue (kuyruk) yapisi geregi insertion order'a gore siralama yapmasi beklenir
		// Ancak constructor olarak PriorityQueue sectigimiz icin Java tarafindan belirlenen
		// priority'e gore siralama yapar
		
		// Biz de istersek pririty kuralini tanimlayabiliriz.. O zaman bizim istegimize gore siralar
		
		Queue<String> k2=new LinkedList<>();
		// ayni elemanlarla fakat LinkedList constructor'i kullanarak olusturdugumuz
		// queue ise beklenenlere uygun olarak ekleme sirasina gore yazdirir
		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		
		System.out.println(k2); // [D, C, M, A]
		
		// Queue'nun yapisi geregi FIFO kurali gecerlidir
		
		k2.offer("Z");
		// en sona eleman ekler
		System.out.println(k2); // [D, C, M, A, Z]
	
		System.out.println(k2.peek());// D
		// silmeden ilk elemani bize dondurur
		System.out.println(k2); // [D, C, M, A, Z]
		k2.remove();
		System.out.println(k2); // [C, M, A, Z]
		k2.remove();
		System.out.println(k2);//[M, A, Z]
		System.out.println(k2.remove("A")); // true
		System.out.println(k2);//[M, Z]
		k2.poll();
		System.out.println(k2);//[Z]
		// poll() methodu ilk elemani siler
		System.out.println(k2.element());// Z
		// silmeden ilk elemani getirir
		
		
		k2.remove(); // bu satirda son eleman olan Z de silindi
		// artik queue bos
		System.out.println(k2.isEmpty()); // true
		
		k2.poll(); // poll() bos bir queue'da kullanilirsa excep. vermez, null dondurur
		// k2.remove(); // bos bir queue'dan remove() ile eleman silmek istersek exception verir
		
		//System.out.println(k2.element());// queue bossa exc. firlatir
	}

}
