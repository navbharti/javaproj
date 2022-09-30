package bca.jain.jdbc;

public class LoadingClass {
	static {
		System.out.println("This is static block in LoadingClass");
	}
	
	{
		System.out.println("this si non static block in LoadingClass");
	}
}
