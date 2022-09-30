package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		A o1 = new A();
		o1.a = 12;
		o1.b =20;
		o1.print();
		
		A o3 = new A();
		o3.a = 1200;
		
		o1.print();
		System.out.println(o1.a);
		System.out.println(o3.a);
		
		B o2 = new B();
		o2.a = 192;
		o2.b =200;
		o2.print();
		
		System.out.println(A.a);
		System.out.println(B.a);
		
	}

}
