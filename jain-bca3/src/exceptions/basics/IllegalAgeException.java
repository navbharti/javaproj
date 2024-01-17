package exceptions.basics;

public class IllegalAgeException extends RuntimeException{
	IllegalAgeException(String message){
		super(message);
	}
}
