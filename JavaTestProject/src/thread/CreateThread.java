package thread;

public class CreateThread {
	int i = 0;

	public static void main(String[] args) throws InterruptedException {
		new CreateThread().createThread();
		System.out.println("Exiting main...");
	}

	public void createThread() throws InterruptedException {
		Runnable target = new Runnable() {

			public void run() {
				System.out.println("invoked ::"
						+ Thread.currentThread().getName() + " , " + i);
			}
		};
		++i;
		Thread t1 = new Thread(target, "Thread1");
		t1.start();
		t1.join();
		++i;
		Thread t2 = new Thread(target, "Thread2");
		t2.start();
		t2.join();
	}

}
