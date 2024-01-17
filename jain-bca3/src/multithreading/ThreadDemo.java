package multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		JainThread jt = new JainThread(); //new born thread
		jt.start(); //Runnable, and call run() method
		System.out.println(Thread.currentThread().getName());
		JainThread jt1 = new JainThread(); //new born thread
		jt1.start(); //Runnable, and call run() method
		
		for(int i=0; i<=10; i++)
			System.out.println("Main Thread executing... "+ i);
		Thread.currentThread().setName("Naveen");
		System.out.println(Thread.currentThread().getName());

	}

}

class JainThread extends Thread{
	public void run() {
		for(int i=0; i<=10; i++)
			System.out.println("Thread1 executing... "+ i);
	}
}