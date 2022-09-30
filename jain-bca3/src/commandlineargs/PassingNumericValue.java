package commandlineargs;

public class PassingNumericValue {

	public static void main(String[] args) {
		for(String s: args) {
			int a = Integer.parseInt(s);
			System.out.println(a + 10);
		}
	}

}
