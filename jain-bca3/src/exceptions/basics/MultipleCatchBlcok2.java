package exceptions.basics;

public class MultipleCatchBlcok2 {

	public static void main(String[] args) {
		System.out.println("Welcome message-1");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(10/2);
			//e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
