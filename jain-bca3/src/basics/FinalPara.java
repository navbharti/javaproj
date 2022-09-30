package basics;

public class FinalPara {
		final double PI=3.1415;
		final double ABC;
		final static double staticABC=123.45;
		final static double staticDEF;
//		void changeABC() {
//			ABC=12;
//		}
		FinalPara(){
			ABC = 23.345;
		}
		
//		int cube(final int n){ 
//		n=n+2; //can't be changed as n is final 
//		return n*n*n; 
//		} 
		
		public static void main(String args[]){ 
			FinalPara b=new FinalPara(); 
			//b.cube(5); 
			} 
		
		static{
			staticDEF = 2.456;
		}
	}









/*

final class A{
	
}


class C{
	final void method1() {
		
	}
}














class D extends C{
	void method1() {
		System.out.println("Overriding method1");
	}
}




class B extends A{
	
}

*/