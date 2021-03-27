package day37_overriding; 

class Derived {
	public void getDetails() {
		System.out.println("Derived class");
	}
}

public class Test02 extends Derived {
	
	public void getDetails() {
		System.out.println("Test class");
	}
	

	public static void main(String[] args) {
		Derived obj = new Test02();
		obj.getDetails();
	}
}