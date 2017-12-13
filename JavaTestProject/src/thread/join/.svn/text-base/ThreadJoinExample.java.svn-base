package thread.join;

public class ThreadJoinExample {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyRunnableExample(), "t1");
		Thread t2 = new Thread(new MyRunnableExample(), "t2");
		Thread t3 = new Thread(new MyRunnableExample(), "t3");

		t1.start();
		t1.join();

		t2.start();
		t2.join();

		t3.start();
		t3.join();

		System.out.println("All threads have executed.Exiting from main method");

	}
}

class MyRunnableExample implements Runnable {

	public void run() {
		System.out.println("Thread ::" + Thread.currentThread().getName()
				+ " has started");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ::" + Thread.currentThread().getName()
				+ " has ended");
	}
}
