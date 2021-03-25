package day32_stringbuilder;

import java.time.LocalTime;

public class C2_StringBuilder02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 100000 kere donecek bir loop yazalim
		// loop'da String ve StringBuilder kullanip 
		// oncesinde ve sonrasinda zaman alalim
		// hizlarini karsilastiralim
		
		
		String str="";
		StringBuilder sb=new StringBuilder("");
		
		LocalTime lt1=LocalTime.now();
		System.out.println(lt1);
		
		
		for (int i = 0; i < 50000; i++) {
			str+=i;
		}
		
		LocalTime lt2=LocalTime.now();
		System.out.println(lt2);

		LocalTime lt3=LocalTime.now();
		System.out.println(lt3);
		
		
		for (int i = 0; i < 50000; i++) {
			sb.append(i);
		}
		
		LocalTime lt4=LocalTime.now();
		System.out.println(lt4);
	}

}
