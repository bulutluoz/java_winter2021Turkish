package day36_inheritance;

class Okul {
	public void getDetails() {
		System.out.println("Derived class ");
	}
}

public class Test03 extends Okul {
	public Test03() {
		System.out.println("Test class ");
		super.getDetails();
	}

	public static void main(String[] args) {
		Test03 obj = new Test03();
		obj.getDetails();
	}
}