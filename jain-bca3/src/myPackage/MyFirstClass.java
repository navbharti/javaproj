package myPackage;

public class MyFirstClass {

	public static void main(String[] args) {
		long res1 = factorial(7);
		System.out.println("factorial(5): "+ res1);
	}
	
	private static long factorial(int x) {
		long fact = 1;
		while(x>0) {
			fact = fact * x;
			x--;
			
		}
		
		return fact;
	}
	
	private static boolean isStrong(int x) {
		int n = x;
		long sum = 0;
		while(n>0) {
			int d;
			d = n%10;
			n = n / 10;
			sum = sum + factorial(d);
		}
		if(sum == x)
			return true;
		else
			return false;
	}

}
