package basics;

public class StaticMembers {
	public static void main(String args[]) {
		//must create object first
		ThrowThrowsDemo s = new ThrowThrowsDemo();
		s.roll = 12;
		s.marks = 50;
		
		System.out.println("s.roll: "+s.roll);
		//System.out.println(Student.roll);
		System.out.println("s.marks: "+s.marks);
		
		ThrowThrowsDemo s2 = new ThrowThrowsDemo();
		s2.marks=60;
		s2.roll = 200;
		System.out.println("s2.roll: "+s2.roll);
		System.out.println("s2.marks: "+s2.marks);
		
		ThrowThrowsDemo s3 = new ThrowThrowsDemo();
		s3.marks = 70;
		System.out.println("s3.roll: "+s3.roll);
		System.out.println("s3.marks: "+s3.marks);
		
		System.out.println("s.roll: "+ s.roll);
		System.out.println("s2.roll: "+ s2.roll);
		System.out.println("s3.roll: "+ s3.roll);
		
		s.method1();
		ThrowThrowsDemo.method1();
		s.method2();
		//Student.method2();
		
		StaticMembers obj = new StaticMembers();
		obj.printMessage1(); //using object name
		StaticMembers.printMessage1(); //using classname
		printMessage1(); //directly calling
		
	}
	
	//static method in main class
	static void printMessage1() {
		System.out.println("Welcome to Jain University");
	}
	
}
