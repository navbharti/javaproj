package inheritance;

public class Test2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(12.5);
		
		System.out.println("Radius: "+ c.getRadius());
		
		Square sqr = new Square();
		sqr.setSide(200.5);
		
		System.out.println(sqr.getSide());
		
		Rectangle r = new Rectangle();
		r.setLength(12.5);
		r.setBreadth(4.5);
		System.out.println("Length: "+ r.getLength());
		System.out.println("Breadth: "+ r.getBreadth());
		
		System.out.println("Area of Circle: "+ c.area());
		System.out.println("Perimeter of Circle: "+ c.perimeter());
		
		System.out.println("object c: "+ c);

	}

}

naveenkumar@jainuniversity.ac.in

