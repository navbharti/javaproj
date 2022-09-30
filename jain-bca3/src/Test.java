
public class Test {

	public static void main(String[] args) {
		// create an object of Rectangle
		Rectangle r1 = new Rectangle();
		
		//call area() method and store the returned value in a
		int a = r1.area();
		
		//call perimeter() method and store the returned value in p
		int p = r1.perimeter();
		
		//print the value of area and perimeter
		System.out.println(a);
		System.out.println(p);

	}

}

 class Rectangle
{
	private int length=10;
	private int width=20;
	
	int area()
	{
		return length * width;
	}
	
	int perimeter()
	{
		return 2*(length + width);
	}
}