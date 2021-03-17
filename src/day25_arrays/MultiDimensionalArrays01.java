package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* 1- Ic icice array olusturdugumuzda disardaki ana array'e outer array
		 	  icerdeki kucuk array'lere ise inner array denir
		   2- Eger icerdeki array'lerin boyutlari birbirinden farkli ise 
		      Array'i ancak tum elemanlari	yazarak declare edebiliriz
		   3- Multi dimensional array'de bir elemanin indexi icin 
		      en disdaki array haric, elemana kadar ici ice olan tum arraylerin 
		      indexlerini yazmak gerekir
		*/
		
		int arr[][]= {{1,3,5}, {3,5},{5,9,11,3}}; // iki katli bir array'dir
		
		// 11'i index ile ifade etmek istersek arr[2][2]
		
		//  eger Array'i uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int [3][2];
		// [3] ilk yazilan sayi outer array'in icinde kac tane inner array oldugunu belirtir
		// [2] her bir inner array'in uzunlugu
		
		System.out.println(Arrays.toString(arr2));
		
		// Multidimensional array'leri yazdirmak icin toString method'u kullanilamaz
		// Cunku toString methodu outer array'i String'e cevirir
		// outer array'in icinde inner array'ler oldugundan toString method'unda inner array'lerin
		// referans degerleri yazdirilir
		System.out.println(Arrays.deepToString(arr2)); 

	}

}
