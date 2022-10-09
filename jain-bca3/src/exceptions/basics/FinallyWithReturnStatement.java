package exceptions.basics;

public class FinallyWithReturnStatement {

	public static void main(String[] args) {
		System.out.println(method1());
	}
	
	public static int method1() {
		try {
			System.out.println("try block");
			System.out.println(10/2);
			return 10;
		}
		catch(ArithmeticException e ) {
			System.out.println("catch block");
			e.printStackTrace();
			return 100;
		}
		finally {
			System.out.println("finally block");
			return 1000;
		}
	}

}
