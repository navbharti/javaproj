package array;

import java.util.Scanner;

public class ReadingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int n=5;
		for(int i=0; i<n; i++) {
			System.out.printf("Enter %dth Number: ", i+1);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Output");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
