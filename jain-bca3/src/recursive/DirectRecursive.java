package recursive;

public class DirectRecursive {

	public static void main(String[] args) {
		String s = "Welcome";
		printNTimes(s, 10);
	}

	public static void printNTimes(String s, int n) {
		if(n == 0)
			return;
		System.out.println(s);
		printNTimes(s, n-1);
	}
}
