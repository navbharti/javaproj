package exceptions.basics;

import java.io.*;

public class IllegralArgumentExceptionDemo {

public static void print(int a) {
		if(a >= 18){
			System.out.println("Eligible for Voting");
		}
		else{
	
			throw new IllegalArgumentException("Not Eligible for Voting");						
		}
	
	}

	public static void main(String[] args) {
		IllegralArgumentExceptionDemo.print(14); 
	}
}
