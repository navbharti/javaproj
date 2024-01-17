package multithreading;

public class ThreadNameSetterGetter extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread1 t = new MyThread1();
		System.out.println(t.getName());
		Thread.currentThread().setName("ABC-Thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		//System.out.println(10/0);
		System.out.println("This line executed by: "+ Thread.currentThread().getName());
		t.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(11);
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of Current Thread: "+ Thread.currentThread().getPriority());
		MyThread1 t1 = new MyThread1();
		
		System.out.println("Priority of t Thread; "+t1.getPriority());
		
	}

}

class MyThread1 extends Thread{
	public void run() {
		System.out.println("This line executed by: "+ Thread.currentThread().getName());
		System.out.println("Child Thread");
	}
}