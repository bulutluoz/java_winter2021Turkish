package day22_constructor;

public class ParametreliRunner {

	public static void main(String[] args) {
		
		ParametreliConstructor oto1 = new ParametreliConstructor(); 
		System.out.println(oto1.marka + " " + oto1.model + " " + oto1.yil + " " + oto1.kazasiVarMi);
		// default degerleri yazdirir
		
		ParametreliConstructor oto2 = new ParametreliConstructor(2015); //1
		System.out.println(oto2.marka + " " + oto2.model + " " + oto2.yil + " " + oto2.kazasiVarMi);
		// null null 2015 false
		
		ParametreliConstructor oto3 = new ParametreliConstructor("Toyota", "Corolla" , 2010 , true);//4
		System.out.println(oto3.marka + " " + oto3.model + " " + oto3.yil + " " + oto3.kazasiVarMi);
		
	}

}
