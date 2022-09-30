import java.util.Scanner;

public class BitwiseDemo {

	public static void main(String[] args) {
		int a = 9;
		int b = 12;
		int c = a&b;
		System.out.println(c);
		int d = a|b;
		System.out.println(d);
		int e = ~a;
		System.out.println(e);
		int f = a^b;
		System.out.println(f);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer Value: ");
		int var = sc.nextInt();
		if((var & 1)==1)
			System.out.println("LSB bit is on");
		else
			System.out.println("LSB bit is off");
		
		System.out.print("Enter an Integer Value: ");
		int var1 = sc.nextInt();
		int msbbits = 1<<31;
		if((var1 & msbbits) == 1)
			System.out.println("MSB bit is on");
		else
			System.out.println("MSB bit is off");
		System.out.println("Memory take by int: "+Integer.SIZE + " bits"+" Range: ["+Integer.MIN_VALUE+","+Integer.MAX_VALUE+"]");
		System.out.println("Memory take by char: "+Character.SIZE + " bits"+" Range: ["+Character.MIN_VALUE+","+Character.MAX_VALUE+"]");
		System.out.println("Memory take by byte: "+Byte.SIZE + " bits"+" Range: ["+Byte.MIN_VALUE+","+Byte.MAX_VALUE+"]");
		System.out.println("Memory take by long: "+Long.SIZE + " bits"+" Range: ["+Long.MIN_VALUE+","+Long.MAX_VALUE+"]");
		System.out.println("Memory take by float: "+Float.SIZE + " bits"+" Range: ["+Float.MIN_VALUE+","+Float.MAX_VALUE+"]");
		System.out.println("Memory take by double: "+Double.SIZE + " bits"+" Range: ["+Double.MIN_VALUE+","+Double.MAX_VALUE+"]");
		System.out.println("Memory take by short: "+Short.SIZE + " bits"+" Range: ["+Short.MIN_VALUE+","+Short.MAX_VALUE+"]");
		

	}

}
