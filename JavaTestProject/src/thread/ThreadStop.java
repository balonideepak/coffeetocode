package thread;

import java.util.concurrent.TimeUnit;

public class ThreadStop {
	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		Thread t = new Thread(task);
		t.start();
		TimeUnit.MILLISECONDS.sleep(200);
		task.stop();
		
	}
}

class Task implements Runnable {
	private boolean stop = false;

	public void stop() {
		stop = true;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("Thread " + Thread.currentThread().getName()
					+ " is running .");
		}
		System.out.println("Thread " + Thread.currentThread().getName()
				+ " is stopped .");
	}

}