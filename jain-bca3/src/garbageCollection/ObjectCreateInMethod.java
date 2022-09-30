package garbageCollection;

public class ObjectCreateInMethod {

	public static void main(String[] args) {
		method(); //after exection of this method two objects are eligible for GC
	}
	
	public static void method() {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
	}

}
