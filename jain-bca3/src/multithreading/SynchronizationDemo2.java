package multithreading;


class Table{  
	
	synchronized void printTable(int n){//method not synchronized  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
}  
	  
class MyThread3 extends Thread{  
	Table t;  
	
	MyThread3(Table t){  
		this.t=t;  
	} 
	
	public void run(){  
		t.printTable(5);  
	}  
  
}  

class MyThread4 extends Thread{  
	Table t;  
	
	MyThread4(Table t){  
		this.t=t;  
	}  
	
	public void run(){  
		t.printTable(100);  
	}  
}  
	  
public class SynchronizationDemo2 { 
	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread3 t1=new MyThread3(obj);  
		MyThread4 t2=new MyThread4(obj);  
		t1.start();  
		t2.start();  
	}  
}  