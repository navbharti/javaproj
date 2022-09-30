package inheritance;

public class SimpleInheritance {
	public static void main(String args[]) {
		Square sqr = new Square();
		
		double a = sqr.area();
		
		double p = sqr.perimeter();
		
		System.out.println("Area: "+ a);
		System.out.println("Perimeter: "+ p);
	}
}
