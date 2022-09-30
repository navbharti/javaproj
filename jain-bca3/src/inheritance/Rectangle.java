package inheritance;

public class Rectangle extends Square{
	double breadth;
	
	public void setLength(double length) {
		this.dim = length;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double getLength() {
		return this.dim;
	}
	
	public double getBreadth() {
		return this.breadth;
	}
}
