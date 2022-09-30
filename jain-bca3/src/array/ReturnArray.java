package array;

import java.util.Scanner;

public class ReturnArray {

	public static void main(String[] args) {
		int arr[];
		int n=5;
		arr = readArray(n);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] readArray(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.printf("Enter %dth element: ", i+1);
			a[i] = sc.nextInt();
		}
		
		sc.close();
		return a;
	}

}
