package garbageCollection;

public class ObjectCreateInMethod2 {

	public static void main(String[] args) {
		Rectangle r = method(); //after exection of this method one object is eligible for GC
	}
	
	public static Rectangle method() {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		return r1;
	}

}
