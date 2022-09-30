package inheritance;

public class Cuboid extends Rectangle{
	public double height;
	
	public double area() {
		return 2.0 * (dim*breadth + breadth*height + height*dim);
	}
	
	public double volume() {
		return dim * breadth * height;
	}

	public Cuboid() {
		super();
		System.out.println("Cuboid Constructor Executed!!!");
	}
	
	public Cuboid (double length) {
		super(length);
		System.out.println("Cuboid with length parameter");
	}
	
	public Cuboid(double length, double breadth) {
		super(length, breadth);
		System.out.println("Cuboid with length and breadth");
	}
	
	public Cuboid(double length, double breadth, double height) {
		super(length, breadth);
		this.height = height;
		System.out.println("Cuboid with length, breadth and height");
	}
}

