package recursive;

public class RecursiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling print1_N(10); ");
		print1_N(10);
		System.out.println("Calling printN_1(10); ");
		printN_1(10);
		System.out.println("Calling printNameNTimes(\"Dr. Naveen Kumar\", 5); ");
		printNameNTimes("Dr. Naveen Kumar", 5);
		String name = "Dr. Naveen Kumar";
		System.out.println("Calling printRev(name, name.length()-1);");
		printRev(name, name.length()-1);
		System.out.println("");
		System.out.println("Calling factorial(6): "+ factorial(6));
		
		System.out.println("Calling fibonacci(7): "+ fibonacci(7));

	}
	
	public static void print1_N(int n) {
		
		if(n==0) {
			return;
		}
		print1_N(n-1);
		System.out.println(n);
	}
	
	public static void printN_1(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		printN_1(n-1);
		
	}
	
	public static void printNameNTimes(String name, int n) {
		if(n==0) return;
		System.out.println(name);
		printNameNTimes(name, n-1);
	}
	
	public static void printRev(String str, int n) {
		if(n<0) return;
		System.out.print(str.charAt(n));
		printRev(str, n-1);
		
	}
	
	public static long factorial(long n) {
		if(n<=1) return n;
		return n * factorial(n-1);
	}

	public static long fibonacci(int n) {
		if(n<=1) return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
}
