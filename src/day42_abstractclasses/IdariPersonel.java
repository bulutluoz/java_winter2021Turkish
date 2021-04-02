package day42_abstractclasses;

public class IdariPersonel extends Personel{
	
	// extends Personel yazarak Abstract Personele concrete bir child olusturdum
	// ve Java CTE verdi 
	// cozum olarak urettigi 2 ihtimal var
	// 1- Unimplemented(uyarlanmamis) method'lari uyarla
	// 2- Ya da Personel class'indan abstract kelimesini kaldir
	// Bu class'in calisabilmesi icin 2 islemden birini yapmak zorundayiz

	public static void main(String[] args) {
		

	}
	// concrete bir class'da abstract bir method olabilir mi ?
	// abstract bir method sadece abstract bir class'da olusturulabilir...
	// public abstract void surekliCalisma();
	// The abstract method surekliCalisma in type IdariPersonel 
	// can only be defined by an abstract class

	@Override
	public void maasHesapla() {
		System.out.println("idari personel maasi 4000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}



}
