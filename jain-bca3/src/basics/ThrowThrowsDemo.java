package basics;

import javax.xml.crypto.URIDereferencer;

public class ThrowThrowsDemo {
	public static void main(String args[]) {
	
		
		Man m = new Man();
		m.setAge(15);
	}
}


class Person{
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UnderAgeException, OverAgeException {
		if(age < 18 ) {
			throw new UnderAgeException("You are Under Aged to Vote");
		}
		else if(age > 65) {
			throw new OverAgeException("You are Over Aged to Vote");
		}
		this.age = age;
	}
	
	public String toString() {
		String s = String.format("Age: %d", this.age);
		return s;
	}
}

class Man extends Person{
	
}

class UnderAgeException extends RuntimeException{
	UnderAgeException(String msg){
		super(msg);
	}
}

class OverAgeException extends RuntimeException{
	OverAgeException(String msg){
		super(msg);
	}
}