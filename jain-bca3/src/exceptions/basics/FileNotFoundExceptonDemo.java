//Java program to demonstrate FileNotFoundException
package exceptions.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileNotFoundExceptonDemo {

		public static void main(String args[]) {
			//try {

				// Following file does not exist
				File file = new File("E://file.txt");

				FileReader fr = new FileReader(file);
			
		}
	}
