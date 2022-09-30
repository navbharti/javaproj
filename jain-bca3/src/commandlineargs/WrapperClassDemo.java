package commandlineargs;

public class WrapperClassDemo {

	public static void main(String[] args) {

		int a = 10; //primitive data
		Integer aObj = Integer.valueOf(a);
		if(aObj instanceof Integer)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		float f = 3.14f;
		double d = 3.1415;
		char ch = 'A';
		Float fObj = Float.valueOf(f);
		Double dObj = Double.valueOf(d);
		Character chObj = Character.valueOf(ch);
		System.out.println(fObj);
		System.out.println(dObj);
		System.out.println(chObj);
		
		System.out.println(aObj - 10);
		System.out.println(fObj - 10);
		System.out.println(dObj - 10);
		System.out.println(chObj - 10);
		
		System.out.println(a - 10);
		System.out.println(f - 10);
		System.out.println(d - 10);
		System.out.println(ch - 10);
	}
	
	

}
