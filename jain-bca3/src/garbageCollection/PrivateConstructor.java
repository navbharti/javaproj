package garbageCollection;

 class Constructor {
	 private static Constructor c;
	private Constructor() {
		
		 
		System.out.println("constructor executed");
		
	}

	public static Constructor getObject() {
		if(c!=null) return c;
		c = new Constructor();
		return c;
	}
	
	
}
 
 public class PrivateConstructor{
	 public static void main(String args[]) {
		 Constructor c = Constructor.getObject();
		 System.out.println(c);
		 
		 Constructor c1 = Constructor.getObject();
		 System.out.println(c1);
		 
		 Constructor c2 = Constructor.getObject();
		 System.out.println(c2);
		 
		 Constructor c3 = Constructor.getObject();
		 System.out.println(c3);
		 
		 
	 }
 }
