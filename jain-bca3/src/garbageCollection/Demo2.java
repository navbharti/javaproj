package garbageCollection;

public class Demo2 {

	public static void main(String[] args) {
			String s = new String("Welcome to Jain University");
			
			s = null;
			
			System.gc();
			System.out.println("End of main() method");
			
		}
		
		public void finalize() {
			System.out.println("finalize() method of Demo");
		}
}
