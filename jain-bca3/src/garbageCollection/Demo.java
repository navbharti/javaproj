package garbageCollection;

public class Demo {

	public static void main(String[] args) {
			Demo d = new Demo();
			d.finalize();
			d.finalize();
			d = null;
			System.gc();
			System.out.println("End of main() method");
			
		}
	
		Demo(){
			System.out.println("Demo Constructor");
		}
		
		public void finalize() {
			System.out.println("finalize() method of Demo");
		}
}
