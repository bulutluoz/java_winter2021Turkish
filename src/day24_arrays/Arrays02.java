package day24_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		/*
		 Soru 1: Verilen  bir array’in tum elemanlarini 
		 bir soldaki konuma tasiyacak bir program yazin. 
		 Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
		 */
		
		int arr[]= {1,2,3,4,5,6};
		
		
		int temp= arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];
		}

		arr[arr.length-1] =temp;
		System.out.println(Arrays.toString(arr));
	}

}
