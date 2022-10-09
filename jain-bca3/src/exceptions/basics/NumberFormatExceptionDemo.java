// Java program to demonstrate NumberFormatException
package exceptions.basics;

public class NumberFormatExceptionDemo {
		public static void main(String args[])
		{
			try {
				// "abc" is not a number
				int num = Integer.parseInt ("abc") ;

				System.out.println(num);
			} catch(NumberFormatException e) {
				System.out.println("Number format exception");
			}
		}
	}
