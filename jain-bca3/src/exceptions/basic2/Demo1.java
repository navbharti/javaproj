package exceptions.basic2;

public class Demo1 {

	public static void main(String[] args) {
		
		method1();
		System.out.println("main() terminated");

	}
	
	public static void method1() {
		
		method2();
		System.out.println("method1() terminated");
	}

	public static void method2() {
		
		System.out.println("Welcome to Jain Deemed to be University");
		System.out.println("method2()terminated ");
	}
}
