package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		// 

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2021-03-19T23:06:09.219
		
		System.out.println(ldt.toString()); // 2021-03-19T23:06:09.219
		
		String time= ldt.toString();

		System.out.println(time.startsWith("2021")); // true
		
		
		}

}
