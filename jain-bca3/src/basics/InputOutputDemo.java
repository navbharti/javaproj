package basics;

import java.util.Scanner;

public class InputOutputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Result: "+sum);
		sc.close();
	}

}
