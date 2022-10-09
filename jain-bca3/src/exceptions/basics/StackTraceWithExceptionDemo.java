package exceptions.basics;

//Default Exception will handle in this case

public class StackTraceWithExceptionDemo {

	public static void main(String[] args) {
		function1();
	}
	
	public static void function1() {
		function2();
	}
	
	public static void function2() {
		function3();
	}
	
	public static void function3() {
		System.out.println(10/0);
	}

}
