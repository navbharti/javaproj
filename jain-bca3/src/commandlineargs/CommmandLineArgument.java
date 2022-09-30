package commandlineargs;

public class CommmandLineArgument {

	public static void main(String[] args) {
		System.out.println("Command Line Arguments");
		
		for(String s: args) {
			System.out.println(s);
		}
	}

}
