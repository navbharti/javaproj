package commandlineargs;

public class AddTwoNums {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Number of Arguments mismatch");
			System.exit(0);
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a + b;
		System.out.println("Sum: "+ sum);
	}

}
