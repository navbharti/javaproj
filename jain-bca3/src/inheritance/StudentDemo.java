package inheritance;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student(123, "Rakesh", "Bangalore", 7.7, "BCA-Common");
	/*	
		s.setId(21876862);
		s.setName("Rakesh");
		s.setAddress("Jayanagar");
		s.setCgpa(7.7);
		s.setCourse("BCA-AI"); */
		
		//System.out.println(s);
		
		Student arr[] = new Student[5];
		arr[0] = s;
		
		System.out.println(arr[0]);
		
		arr[1] = new Student(123, "Mahesh", "Bangalore", 7.7, "BCA-CS");
		arr[2] = new Student(133, "Mahesh", "Bangalore", 7.7, "BCA-CS");
		arr[3] = new Student(143, "Mahesh", "Bangalore", 7.7, "BCA-CS");
		arr[4] = new Student(153, "Mahesh", "Bangalore", 7.7, "BCA-CS");
		System.out.println(arr[1]);
		
		System.out.println(s.getId());
		
		for(Student stud: arr)
			System.out.println(stud);
		
	}

}
