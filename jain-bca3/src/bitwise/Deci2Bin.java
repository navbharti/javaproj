package bitwise;

import java.util.Scanner;

public class Deci2Bin {
	static int b;
	int c;
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<32; i++)
		{
			if((1&(n>>i))==1)
				System.out.print("1");
			else
				System.out.print("0");
		}
		System.out.println();
		//System.out.println(a);
		System.out.println(b);
		Deci2Bin d2b = new Deci2Bin();
		System.out.println(d2b.c);
		System.out.println(1<<1);

	}

}
