package basics;

public class UserDefineExceptionDemo {
	public static void main(String args[]) throws Exception{
		Person p = new Person();
		p.setAge(20);
	}
}


class Person{
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age < 18 || age > 18) {
			throw new Exception();
		}
		this.age = age;
	}
	
	
}