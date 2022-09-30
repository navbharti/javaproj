package garbageCollection;

public class GarbageCollection {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total KB in Heap: "+ r.totalMemory()/1024.0);
		System.out.println("Available KB in Heap: "+ r.freeMemory()/1024.0);
		
		for(int i=1; i<=10; i++) {
			Rectangle rect = new Rectangle();
			rect = null;
		}
		System.out.println();
		System.out.println("Before Garbage Collector Requested");
		//System.out.println("Total KB in Heap: "+ r.totalMemory()/1024.0);
		System.out.println("Available KB in Heap: "+ r.freeMemory()/1024.0);
		
		r.gc();
		
		System.out.println();
		System.out.println("After Garbage Collector Requested");
		//System.out.println("Total KB in Heap: "+ r.totalMemory()/1024.0);
		System.out.println("Available KB in Heap: "+ r.freeMemory()/1024.0);
	}

}
