package garbageCollection;

public class Reassign {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		//so far no objects are eligible for GC
		
		r1 = new Rectangle(); //one object is eligible for GC
		
		r2 = r1; //two objects are eligible for GC
		
		
	}

}
