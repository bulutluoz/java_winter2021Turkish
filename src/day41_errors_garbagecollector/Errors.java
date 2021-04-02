package day41_errors_garbagecollector;

public class Errors {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// System.out.println(20/0); // RTE degil RunTimeException
		
		// String str="asd; // CTE dur... cunku cift tirnagi tamamlamadikca kod calismaz
		// bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir.
		
		// Java'da Error dendiginde onune gecilemeyen, kod ile cozulemeyen
		// sistemden kaynakli buyuk hatalar kastedilir.
		
		// Error'lar unchecked'dir ve Java bunlari ongoremez
		// ancak gerceklestiginde kodun calismasi durdurulur.
		
		String str="";
		for (int i = 0; i < 10000000 ; i++) {
			str+=i;
		}
		


	}

}
