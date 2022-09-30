package recursive;

public class InDirectRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even(10);
	}
	
	public static void even(int n) {
		if(n<=0) 
			return;
		System.out.println("Even");
		odd(n-1);
	}
	
	public static void odd(int n) {
		if(n<=0)
			return;
		System.out.println("Odd");
		even(n-1);
	}

}
