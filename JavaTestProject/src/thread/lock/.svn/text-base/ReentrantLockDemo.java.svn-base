package thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	private int count = 0;
	private final ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		final ReentrantLockDemo obj = new ReentrantLockDemo();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (obj.getCountViaLock() < 6) { // getCountViaLock
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (obj.getCountViaLock() < 6) { // getCountViaLock
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.start();
		t2.start();

		/****** Can be removed block *********/
		t1.join();
		t2.join();
		System.out.println(" >>>>>  Finished execution >>>>> ");
		/****** Can be removed block *********/
		
	}

	private int getCountViaLock() {
		lock.lock();
		try {
			count++;
			System.out.println(" Thread name ::" + Thread.currentThread().getName()+ " , count is ::" + count);
			return count;
		} finally {
			lock.unlock();
		}

	}

	private int getCountViaSync() {
		count++;
		System.out.println(" Thread name ::" + Thread.currentThread().getName()+ " , count is ::" + count);
		return count;
	}
}
