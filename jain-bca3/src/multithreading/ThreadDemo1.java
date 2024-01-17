package multithreading;

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		for(int i=0; i<20; i++) {
			System.out.println("Executing Main thread: "+ i);
		}
		t.start();
	}

}

class MyThread extends Thread {
	public void run() {
		for(int i=0; i<20; i++)  {
			System.out.println("Executing thread: " + i);
		}
	}
	
	public void start() {
		super.start();
		for(int i=0; i<20; i++)  {
			System.out.println("Executing thread: " + i);
		}
	}
}