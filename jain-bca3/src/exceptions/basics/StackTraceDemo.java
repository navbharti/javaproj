package exceptions.basics;

public class StackTraceDemo {

	public static void main(String[] args) {
		System.out.println("Entered main()");
		System.out.println(10/0); //throwing the exception to JVM
		function1();
		System.out.println("Exiting from main()");
	}
	
	public static void function1() {
		System.out.println("Entered funciton1()");
		
		function2();
		System.out.println("Exiting from function1()");
	}
	
	public static void function2() {
		System.out.println("Entered function2()");
		
		function3();
		System.out.println("Exiting from funciton2()");
	}
	
	public static void function3() {
		System.out.println("entered function3()");
		
		System.out.println("exiting from funciton3()");
	}

}

//Default Exception Handling
