package garbageCollection;

public class Nullify {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		//so far no objects are eligible for GC
		
		r1 = null; //one object is eligible for GC
		
		r2 = null; //two objects are eligible for GC
	}

}
