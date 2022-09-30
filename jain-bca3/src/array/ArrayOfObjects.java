package array;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Rectangle arr[] = new Rectangle[3];
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		r1.length = 12.5;
		r1.breadth = 4.6;
		
		r2.length =10.5;
		r2.breadth = 11.5;
		
		r3.length = 4.5;
		r3.breadth = 6.6;
		
		arr[0] = r1;
		arr[1] = r2;
		arr[2] = r3;
		
		System.out.println(arr[0].length);
		System.out.println(arr[0].breadth);
		System.out.println(arr[0].area());
		System.out.println(arr[0].perimenter());
		
		System.out.println(arr.getClass().getName());
		

	}

}

class Rectangle{
	double length;
	double breadth;
	
	double area() {
		return length * breadth;
		
	}
	
	double perimenter() {
		return 2*(length+breadth);
	}
}
