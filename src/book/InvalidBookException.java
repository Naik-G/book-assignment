package book;

public class InvalidBookException extends Exception {
	InvalidBookException(String msg){
		System.out.println("ERROR: "+ msg);
	}
}
