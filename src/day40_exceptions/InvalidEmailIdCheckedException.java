package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {
	

	private static final long serialVersionUID = 1L; 
	// Java exception'larin tekrarsiz olmasini saglamak icin her exception'a unique bir kod verir

	InvalidEmailIdCheckedException(String message){
		super(message);
	}

}
