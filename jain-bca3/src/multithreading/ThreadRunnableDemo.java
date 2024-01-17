package multithreading;

public class ThreadRunnableDemo {
	public static void main(String args[]) {
		ThreadRunnable r = new ThreadRunnable();
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Main Thread");
	}
	
	
	
}

class ThreadRunnable implements Runnable{
	public void run() {
		System.out.println("Child Thread");
	}
}
