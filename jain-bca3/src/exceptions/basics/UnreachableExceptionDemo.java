package exceptions.basics;

import java.io.FileNotFoundException;

public class UnreachableExceptionDemo {

	public static void main(String[] args) {
		try{
			int a = 10 / 0;
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Remaining Code...");

	}

}