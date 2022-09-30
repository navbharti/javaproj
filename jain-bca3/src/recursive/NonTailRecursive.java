package recursive;

public class NonTailRecursive {
	public static void main(String args[]) {
		printN_1(10);
	}
	
	public static void printN_1(int n) {
		if(n<=0)
			return;
		printN_1(n-1);
		System.out.println(n);
	}

}
