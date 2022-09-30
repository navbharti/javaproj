package chaining;

public class Rectangle {
	double l, b;
	public static void main(String[] args) {
		Rectangle r1 =new Rectangle();
		Rectangle r2 =new Rectangle(10.0);
		Rectangle r3 =new Rectangle(10.0, 12.6);
		
	}
	Rectangle(){
		l = 1.0;
		b = 1.0;
		System.out.println("Zero-para constructor");
	}
	
	Rectangle(double x){
		this();
		l = x;
		b = x;
		System.out.println("One-para constructor");
	}
	
	Rectangle(double x, double y){
		this(x);
	
		b = y;
		System.out.println("Two-para constructor");
	}

}
