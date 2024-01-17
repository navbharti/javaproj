package multithreading;

public class GettingSettingPriorityDemo {

	public static void main(String[] args) {
		Thread2 t = new Thread2();
		//t.setPriority(10);
		System.out.println("Current Thread Priority: "+ Thread.currentThread().getPriority());
		System.out.println("t Thread Priority: "+ t.getPriority());
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread-"+i);
		}
	}

}

class Thread2 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread-"+i);
		}
	}
}