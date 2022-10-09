package exceptions.basic2;

public class DefaultException {

		public static void main(String[] args) {
			int a;
			System.out.println("Welcome to Bangalore");
			try {
				a =  10 / 0; //Rinky code
			}
			catch(ArithmeticException obj) {
				//alternative statement goes
				a = 10 / 2;
			}
			System.out.println(a);
			System.out.println("Welcome to Jain Deemed to be university");
			
		}
			
	}