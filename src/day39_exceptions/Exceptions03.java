package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 *  Icice try-catch yerine
			1 tane try ve multiple catch blogu kullanabiliriz
			Ancak bu durumda yazdigimiz exceptionlar arasinda Parent-Child iliskisi varsa
			Once child class'i yazmaliyiz
			Aksi takdirde(yani once parent yazilirsa) child'a is kalmaz
			Java erisilemez catch-blogu diyerek CTE verir
		*/
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			
				while((k=fis.read())!=-1) { 
					System.out.print((char)k);
				}
			} catch (FileNotFoundException e) {  // once child exception'i yazdik
				
				e.printStackTrace();
			

		} catch (IOException e) { // sonra parent exception
			
			
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("Kod bloke olmamisss");

	}

}
