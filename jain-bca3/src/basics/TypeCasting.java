package basics;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10000;
		byte b = 10;
		long l;
		a = b;
		//b = a; //type mismatch 
		a = (int) b; //explicity type conversion, byte in incompatible to int
		
		l = a; //implicit type promotion
		int [] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		x[5] = 60;
		//x[-6] = 65;
		//x[5.6] = 70;

	}

}



