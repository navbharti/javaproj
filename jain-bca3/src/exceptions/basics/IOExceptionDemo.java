// Java program to demonstrate IOException
package exceptions.basics;

import java.util.Scanner;

public class IOExceptionDemo {
		public static void main(String[] args)
		{

			// Create a new scanner with the specified String
			// Object
			Scanner scan = new Scanner("Hello Students");

			// Print the line
			System.out.println("" + scan.nextLine());

			// Check if there is an IO exception
			System.out.println("Exception Output: "+ scan.ioException());

			scan.close();
		}
	}
