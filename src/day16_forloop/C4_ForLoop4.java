package day16_forloop;

public class C4_ForLoop4 {

	public static void main(String[] args) {
		// 50'den buyuk 150'den kucuk olan tamsayilardan
		// 7 ile tam bolunebilenleri toplayip
		// sonucu yazdiran bir kod yaziniz
		
		int toplam=0;
		
		for (int i = 51; i < 150; i++) {
			
			if (i%7==0) {
				//toplam=toplam+i;
				toplam+=i;
			}
		}

		System.out.println(toplam);
	}

}
