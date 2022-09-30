package array;

import java.util.Scanner;

public class ArrayAsParameter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int n=5;
		for(int i=0; i<n; i++) {
			System.out.printf("Enter %dth element: ", i+1);
			arr[i] = sc.nextInt();
		}
		
		//printArray(arr);
		//ArrayAsParameter.printArray(arr);
		ArrayAsParameter obj = new ArrayAsParameter();
		obj.printArray(arr);
		sc.close();
	}
	
	public static void printArray(int arr[]) {
		System.out.println("Output");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
