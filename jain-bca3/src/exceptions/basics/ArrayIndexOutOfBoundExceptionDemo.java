// Java program to demonstrate ArrayIndexOutOfBoundException
package exceptions.basics;

import java.io.FileNotFoundException;

public class ArrayIndexOutOfBoundExceptionDemo {
		public static void main(String args[])
		{
			int a []= new int[5];
			try {
				System.out.println("statement-1");
				//System.out.println("statement-2"); //risky code
				a[6]=9; //risky
				System.out.println("statement-3");
			}
			catch(IndexOutOfBoundsException e) {
				//System.out.println("statement-4");
				System.out.println(10/0);
				
			}
			
			System.out.println("statement-5");
		}
	}


//case-1 there is not exception (1, 2, 3, 5 Normal Terminal)
//case-2 exception in statement-2, catch block is matched (1, 4, 5 Normal Termination)
//case-3 exception in statement-2, catch block is not matched (1, Abnormal Termination)
//case-4 statement-4 
//Note Exception is in statement-4 it always Abnormal Termination
