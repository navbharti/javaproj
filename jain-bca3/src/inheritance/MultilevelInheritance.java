package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setLength(12.5);
		r.setBreadth(4.5);
		
		double a = r.area();
		double p = r.perimeter();
		
		System.out.println("Area: "+ a);
		System.out.println("Perimeter: "+ p);
	}

}
