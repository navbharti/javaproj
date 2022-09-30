package nestedclass;

public class NestdClassDemo {
	String s = "Jain University";
	
	class InnerClass{
	     void print(String x)
	     {
	         System.out.println(s + " " + x);
	         
	     }
	}

	public static void main(String[] args) {
		//creating object of Outer class
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.print("Welcome You");
		//InnerClass inn = new InnerClass();
		//inn.print("Welcomes You");
	}
	
	
}

class Outer{
	String s = "Jain University";
	
	Outer(){
		System.out.println("Outer Constructor");
	}
	
	class Inner{
		Inner(){
			System.out.println("Inner Constructor");
		}
		
		void print(String x)
	     {
	         System.out.println(s + " " + x);
	         fun1();
	         fun2();
	     }
		
	}
	
	static void fun1() {
		System.out.println("this is static method of outer class");
	}
	
	void fun2() {
		System.out.println("This is non static method of outer class");
	}
}






