package day43_interfaces;

public class InterfaceRunner implements Interface02{

	public static void main(String[] args) {
		
		// static olarak tanimlanmis bir variable veya method
		// baska class'dan classIsmi.methodIsmi seklinde cagrilabilir
		
		Interface02.deneme2();
		
		// Default keyword'u ile olusturdugumuz method ise 
		// obje uzerinden cagrilabilir
		
		InterfaceRunner obj1= new InterfaceRunner();
		obj1.deneme();

	}

}
