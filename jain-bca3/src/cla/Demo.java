package cla;

public class Demo {

	public static void main(String[] args) {
		for(String s: args) {
			System.out.println(s);
		}
		
		System.out.println("Total Arguments: "+args.length);

	}

}
