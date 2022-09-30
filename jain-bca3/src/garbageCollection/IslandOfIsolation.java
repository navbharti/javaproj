package garbageCollection;

public class IslandOfIsolation {
	IslandOfIsolation abc;
	
	public static void main(String[] args) {
		IslandOfIsolation obj1 = new IslandOfIsolation();
		IslandOfIsolation obj2 = new IslandOfIsolation();
		IslandOfIsolation obj3 = new IslandOfIsolation();
		
		obj1.abc = obj2; 
		obj2.abc = obj3;
		obj3.abc = obj1;
		
		//so far no objects are eligible for GC
		
		obj1 = null; //so far no objects are eligible for GC
		obj2 = null; //so far no objects are eligible for GC
		obj3 = null; //three objects are eligible for GC
		
		//obj1, obj2, and obj3 are diconnected from outside hence called Island of Isolation
		
	}

}

