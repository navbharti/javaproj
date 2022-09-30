package garbageCollection;

public class ObjectCreateInMethod3 {

	public static void main(String[] args) {
		method(); //after exection of this method two objects are eligible for GC
	}
	
	public static Rectangle method() {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		return r1;
	}

}
