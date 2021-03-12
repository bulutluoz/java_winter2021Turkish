package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// karisik sirali verilen bir array'i sirali olarak yazdiriniz
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// ayni array'i buyukten kucuge dogru nasil yazdirabiliriz ?
		
		for (int i = arr.length-1 ; i >=0 ; i--) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		// ayni array'i buyukten kucuge dogru nasil siralayabiliriz ?
		
		int arrTers[]=new int[arr.length]; // ilk array'in uzunluguna esit yeni bir array olusturdum
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]= arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arrTers));
	}

}
