package inheritance;

public class GeometricShape {
	public double dim= 100;
	
	
	
	GeometricShape(){
		System.out.println("Geometric Shape Constructor Executed!!!");
	}
	
	GeometricShape(double dim){
		this.dim = dim;
		System.out.println("Geometric Shape Constructor Executed!!!");
	}
	
	public double area() {
		System.out.println("This is area()");
		return 0.0;
	}
	
	
	
	public double perimeter() {
		System.out.println("this is perimeter()");
		return 0.0;
	}
	
	public void method1() {
		System.out.println("Hello this is method1 of Geometric Shape");
	}

}
