package thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	// CountDownLatch in Java is a kind of synchronizer which allows one Thread
	// to wait for one or more Threads before starts processing

	/**
	 * @author deepak.baloni
	 * @param args
	 */
	public static void main(String[] args) {
		final CountDownLatch latch = new CountDownLatch(3);

		Thread cacheService = new Thread(new Service("CacheService", 1000,
				latch));
		Thread alertService = new Thread(new Service("AlertService", 5000,
				latch));
		Thread validationService = new Thread(new Service("ValidationService",
				10000, latch));

		cacheService.start(); // separate thread will initialize CacheService
		alertService.start(); // another thread for AlertService initialization
		validationService.start();

		try {
			latch.await(); // main thread is waiting on CountDownLatch to finish
			System.out
					.println("All services are up, Application is starting now");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

}

class Service implements Runnable {

	private String name;
	private int sleeptime;
	private CountDownLatch latch;

	public Service(String name, int sleeptime, CountDownLatch latch) {
		this.name = name;
		this.sleeptime = sleeptime;
		this.latch = latch;
	}

	public void run() {
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {

		}
		System.out.println(name + " is up .");
		latch.countDown();
	}
}
