package inheritance;

public class Circle extends TwoDGeometricShape{
	
	public void setRadius(double radius) {
		this.dim = radius;
	}
	
	public double getRadius() {
		return this.dim;
	}
	
	public double area() {
		return Math.PI * Math.pow(this.getRadius(), 2) ;
	}
	
	public double perimeter() {
		return 2.0 * Math.PI * this.getRadius();
	}
	
	public String toString() {
		String str = "Hello Welcome to Jain University";
		
		return str;
	}
}
