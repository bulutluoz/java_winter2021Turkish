package day25_arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		// Verilen 2 katli bir array'in tum elemanlarinin toplamini bulalim
		
		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				toplam+=arr[i][j];
			}
		}

		System.out.println("array'deki tum elemanlarin toplami : " + toplam);
	}

}
