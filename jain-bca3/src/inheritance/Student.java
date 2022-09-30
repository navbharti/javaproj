package inheritance;

public class Student {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	private long id;
	private String name;
	private String address;
	private double cgpa;
	private String course;

	public String toString() {
		String str = String.format("Id: %d\nName: %s\nAddress: %s\nCGPA: %f\nCourse: %s", id, name, address, cgpa, course);
		return str;
		
	}
	
	public Student(long id, String name, String address, double cgpa, String course) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.cgpa = cgpa;
		this.course = course;
	}
	
}
