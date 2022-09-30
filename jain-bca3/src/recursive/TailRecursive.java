package recursive;

public class TailRecursive {
	public static void main(String args[]) {
		print1_N(10);
	}
	
	public static void print1_N(int n) {
		if(n<=0)
			return;
		System.out.println(n);
		print1_N(n-1);
	}

}
