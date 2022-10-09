package exceptions.basics;

public class MultipleCatchBlcok {

	public static void main(String[] args) {
		System.out.println("Welcome message-1");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
