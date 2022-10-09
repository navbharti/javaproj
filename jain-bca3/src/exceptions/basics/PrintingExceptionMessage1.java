package exceptions.basics;

public class PrintingExceptionMessage1 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0; //Risky Code
		}
		catch(ArithmeticException e) {
			//printing exception information
			System.out.println(e.toString());
		}
		
		System.out.println("Remaing Code...");

	}

}