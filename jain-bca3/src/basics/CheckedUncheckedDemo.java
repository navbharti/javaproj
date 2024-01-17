package basics;

public class CheckedUncheckedDemo {
	public static void main(String args[]) {
		int a;
		int b;
		try {
			a = Integer.parseInt("1b3");
			b = a/0; //Risky code
		}
		catch(ArithmeticException e) {
			a = 10/ 2; //alternate code
			System.out.println("Exception handled");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException is handled");
		}
		finally {
			System.out.println("this is finally block"); //
		}
		
		System.out.println("Welcome");
	}
}
