package basics;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = +10;
		int b = -10;
		double c = +10.5;
		double d = -10.5;
	//	char ch = -'#'; //Type mismatch: cannot convert from int to char
	//	boolean e = -true; //The operator - is undefined for the argument type(s) boolean
	//	boolean f = +true; //error
	//	boolean g = -false; //error
	//	boolean h = +false; //error
		
		
		byte x = 10;
		byte y = 127;
		//byte xy = 128; //Type mismatch: cannot convert from int to byte
		
		//byte z = 10.5; //Type mismatch: cannot convert from double to byte
		
		//byte z = true; //Type mismatch: cannot convert from boolean to byte
		
		//byte z = "hello"; //Type mismatch: cannot convert from String to byte
		
		
		short s = 10;
		//short s1 = 32768; //Unresolved compilation problem: 
							//Type mismatch: cannot convert from int to short
		//short s2 = 10.5; // Type mismatch: cannot convert from double to short
		//short s3 = false; // Type mismatch: cannot convert from boolean to short

		
		//int i = 2147483648; //Unresolved compilation problem: 
							//The literal 2147483648 of type int is out of range 
		
		//int i1 = 2147483648l; //Unresolved compilation problem: 
								//Type mismatch: cannot convert from long to int
		
		//int i2 = true; //Unresolved compilation problem: 
						//Type mismatch: cannot convert from boolean to int
		
		int val = 0;
	/*	if(val) {  //Unresolved compilation problem: 
					//Type mismatch: cannot convert from int to boolean
			System.out.println("Zero Value");
		}
		else {
			System.out.println("Non-Zero Value");
		}
	*/
		
		boolean b1 = true;
		//boolean b2 = 0;
		//boolean b3 = True;
		//boolean b4 = False;
		//boolean b5 = "true";
		
		
	}

}
