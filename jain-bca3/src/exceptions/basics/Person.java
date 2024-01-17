package exceptions.basics;

public class Person {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 18)
			throw new IllegalAgeException("You are under age to vote");
			this.age = age;
	}
	
	public String toString() {
		String s = String.format("Person Age: %d", this.age);
		return s;
	}
	

}
