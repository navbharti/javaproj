package basics;

class UnInitArray {
	int[] a;
	public static void main(String args[]) {
		UnInitArray obj = new UnInitArray();
		System.out.println(obj.a); //null
		System.out.println(obj.a[0]); //Runtime Error
		
		
	}

}

