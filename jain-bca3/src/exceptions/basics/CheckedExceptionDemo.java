// Java Program to Illustrate Checked Exceptions
// Where FileNotFoundException occurred

// Importing I/O classes

package exceptions.basics;

import java.io.*;
import java.util.Scanner;

public class CheckedExceptionDemo {

		// Main driver method
		public static void main(String[] args) 
		{
			try {
				System.out.println("Statmet-1");
				//System.out.println("Statmet-2");
				int a = 10/0;
				System.out.println("Statmet-3");
			}
			catch(Exception e) {
				System.out.println("Statmet-4");
			}
			System.out.println("Statmet-5");
			
		}
	}

