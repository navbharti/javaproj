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

	}

}
