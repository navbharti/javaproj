package exceptions.basics;

import java.io.FileNotFoundException;

public class NextestTryDemo {
	
	public static void main(String args[]) {
		int a;
		try {
			
			try {
				a = 10/0;
			}
			catch(NumberFormatException e) {
				System.out.println("Inner catch block handled");
			}
		}
		catch(Exception e) {
			System.out.println("Outter catch block handled");
		}
	}

}
