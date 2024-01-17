package inheritance.abstractclass;


/* Write an application that prompts the user for the radius of a circle and uses a method called circleArea to calculate the area of the circle */
import java.util.*;
public class CircleArea {
	
	double circleArea(double radius)
	{
		return(Math.PI*radius*radius);
	
	}
	public static void main(String args[])
	{
		CircleArea ob=new CircleArea();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle: ");
		double r=Sc.nextDouble();
		double area=ob.circleArea(r);
		System.out.println("The area of the circle is: "+area);
	
	
	
	
	}



}