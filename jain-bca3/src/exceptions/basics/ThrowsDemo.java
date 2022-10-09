// Java program to demonstrate working of throws
package exceptions.basics;

// This method throws an exception
// to be handled
// by caller or caller
// of caller and so on.

public class ThrowsDemo {

	static void fun() throws IllegalAccessException 
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}

	// This is a caller function 
	public static void main(String args[])
	{
		try {
			fun();
		}
		catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	}
}
