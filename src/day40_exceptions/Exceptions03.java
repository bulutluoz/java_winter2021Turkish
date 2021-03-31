package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// 
		
		int arr[]= {1,4,7,8};
		
		try {
		System.out.println(arr[2]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} 
		finally {
			System.out.println("ne olursa olsun bu satir yazilsin");
		}
		
		System.out.println("kod bloke olmamis");
		
		// Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
		// Finnally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
		// ongoremedigim bir exception olustugunda da calisir....
		
	}

}
