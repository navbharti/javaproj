package exceptions.basic2;

public class FinallyVsReturn {
	public static void main(String args[]) {
		System.out.println(method1());
	}
	
	public static int method1() {
		try {
			System.out.println("try block");
			return 10;
			
		}
		catch(Exception e) {
			System.out.println("catch block");
			return 100;
		}
		finally {
			System.out.println("finally block");
			return 1000;
		}
	}
}


