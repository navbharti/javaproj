// Java program to demonstrate ClassNotFoundException
package exceptions.basics;

public class ClassNotFoundExceptionDemo {

	public static void main(String[] args) {
		try{
			Class.forName("Class1"); // Class1 is not defined
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
			System.out.println("Class Not Found...");
		}
	}
}
