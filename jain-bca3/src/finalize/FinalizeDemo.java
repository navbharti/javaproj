package finalize;

public class FinalizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Welcome to Jain University");
		
		new Student(); //unreferenced object
		
		Student s1 = new Student(); //first object
		Student s2 = new Student(); //second object
		s1 = s2; //now s1 started referencing second object and first object became unreferenced
		
		Student s3 = new Student();
		s3 = null; //unreferenced
		
		System.out.println(str);
		str = null;
		System.gc();
	}

}

class Student{
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Executing finalized method");
	}
}