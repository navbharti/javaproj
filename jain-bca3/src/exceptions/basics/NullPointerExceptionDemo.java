//Java program to demonstrate NullPointerException
package exceptions.basics;

public class NullPointerExceptionDemo {
		public static void main(String args[])
		{
			//try {
				String a = null; //null value
				System.out.println(a.charAt(0));
			//} catch(NullPointerException e) {
			//	System.out.println("NullPointerException..");
			//}
			
			System.out.println("Remaining Code...");
		}
	}
