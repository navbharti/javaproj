package garbageCollection;

public class Demo3 {

	public static void main(String[] args) {
			Demo3 d = new Demo3();
			//d.finalize();
			d = null;
			
			System.gc();
			System.out.println("End of main() method");
			
		}
		
		public void finalize() {
			System.out.println("finalize() method of Demo3");
			System.out.println(10/0);
		}
}