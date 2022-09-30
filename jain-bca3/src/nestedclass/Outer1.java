package nestedclass;

public class Outer1 {
	static int temp1 = 1; 
	static int temp2 = 2; 
	int temp3 = 3;
	int temp4 = 4;
	
	public static class Inner {
		private static int temp5 = 5;
		private static int getSum() {
		return (temp1 + temp2 + temp3 + temp4 + temp5);
		} 
	}
	
	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
		System.out.println(obj.getSum()); 
	}
}