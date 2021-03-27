package day37_overriding; 

class Derived03 {
	public void getDetails() {
		System.out.printf("Derived class ");
	}
}

public class Test03 extends Derived03 {
	public void getDetails() {
		System.out.printf("Test class ");
		super.getDetails();
	}

	public static void main(String[] args) {
		Derived03 obj = new Test03();
		obj.getDetails();
	}
}