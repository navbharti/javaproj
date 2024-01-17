package multithreading;

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display d = new Display();
		Thread1 t1 = new Thread1(d);
		Thread3 t3 = new Thread3(d);
		t1.start();
		t3.start();
	}

}

class Display{
	public void printn() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
	
	public void printC() {
		for(int i=65; i<=75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}

class Thread1 extends Thread{
	Display d;
	public Thread1(Display d) {
		this.d = d;
	}
	public void run() {
		d.printn();
	}
}

class Thread3 extends Thread{
	Display d;
	public Thread3(Display d) {
		this.d = d;
	}
	public void run() {
		d.printC();
	}
}