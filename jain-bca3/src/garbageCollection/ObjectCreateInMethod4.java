package garbageCollection;

public class ObjectCreateInMethod4 {
	static Rectangle r1;
	public static void main(String[] args) {
		method(); //after exection of this method one objects is eligible for GC
	}
	
	public static void method() {
		r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
	}

}
