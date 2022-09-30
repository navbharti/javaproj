package inheritance;

public class Square extends TwoDGeometricShape{
	
	public void setSide(double side) {
		this.dim = side;
	}
	
	public double getSide() {
		return this.dim;
	}
}
