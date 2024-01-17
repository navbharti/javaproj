package exceptions.basics;

public class PersonDemo {
	public static void main(String args[]) {
		Person p = new Person();
		try{
			p.setAge(25);
		}
		catch(NumberFormatException e) {
			p.setAge(18);
		}
		
		System.out.println(p);
	}
}