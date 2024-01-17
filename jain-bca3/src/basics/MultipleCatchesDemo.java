package basics;

public class MultipleCatchesDemo {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try{
			 a = Integer.parseInt("1b3");
			 b = a/0;
		}
		catch(ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("a: "+ " b: "+ b);
		
	}

}
