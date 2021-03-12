package day23_statickeyword;

public class StaticBlock {
	
	static String isim;
	// static block class calistirildiginda ilk olarak calisir (main method'dan bile once)
	// static block'lar static variable'lara deger atamak icin kullanilir 
	
	static {
		System.out.println("1.static block calisti");
	}

	static {
		isim="Mehmet";
		System.out.println(isim);
	}
	

	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		

	}
	


}

