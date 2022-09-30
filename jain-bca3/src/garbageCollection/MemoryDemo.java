package garbageCollection;


// Java code illustrating gc(), freeMemory()
// and totalMemory() methods
public class MemoryDemo {
		public static void main(String arg[])
		{
			Runtime r = Runtime.getRuntime();
			long memory1, memory2;
			Integer integer[] = new Integer[1000];

			// checking the total memory
			System.out.println("Total memory is: " + r.totalMemory());

			// checking free memory
			memory1 = r.freeMemory();
			System.out.println("Initial free memory: " + memory1);

			// calling the garbage collector on demand
			r.gc();

			memory1 = r.freeMemory();

			System.out.println("Free memory after garbage collection: " + memory1);

			// allocating integers
			for (int i = 0; i < 1000; i++)
				integer[i] = new Integer(i);

			memory2 = r.freeMemory();
			System.out.println("Free memory after allocation: " + memory2);

			System.out.println("Memory used by allocation: " + (memory1 - memory2));

			// discard integers
			for (int i = 0; i < 1000; i++)
				integer[i] = null;

			r.gc();

			memory2 = r.freeMemory();
			System.out.println("Free memory after collecting discarded Integers: " + memory2);
		}
	}
