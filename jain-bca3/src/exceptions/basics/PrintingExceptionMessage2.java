package exceptions.basics;

public class PrintingExceptionMessage2 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0; //Risky Code
		}
		catch(ArithmeticException e) {
			//printing exception information
			e.printStackTrace();
		}
		
		System.out.println("Remaing Code...");

	}

}