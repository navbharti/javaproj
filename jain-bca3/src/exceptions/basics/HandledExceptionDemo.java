package exceptions.basics;

public class HandledExceptionDemo {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Remaning Code ....");

	}

}