package day05_wrapperconcetanationoperators;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// AND && , OR ||
		// AND operatoru mukemmeliyetcidir. Hepsi true olursa sonucu true yapar, bir tane 
		//     bile false olsa sonucu false yapar 
		//     matematikteki carpma islemi gibidir (true =1 false=0) 
		boolean isTrue= 5>4 && 7-3>0 ;
		
		System.out.println(isTrue); // true
		
		int x=10;
		int y=5;
		
		
		System.out.println(x/y==2 && x*y>20 && x-y>0); // true
		
		System.out.println(x+y<0 && x-y>0); // false
		
		
		// OR operatoru ise optimisttir. 
		// Verilen karsilastirmalardan 1 tanesi bile dogru ise sonuc true olur
		// (true 1 false0 ise toplama islemi gibi dusunebiliriz)
		System.out.println(x<y || x+y<0 || x*y>0); // True

	}

}
