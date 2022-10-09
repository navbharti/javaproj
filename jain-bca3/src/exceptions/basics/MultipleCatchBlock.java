package exceptions.basics;

import java.io.FileNotFoundException;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a = 10/0;
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
