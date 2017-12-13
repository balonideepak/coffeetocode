package thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclisbarrierDemo {

	private final static int THREAD_COUNT = 3;
	private static CyclicBarrier cyclicBarrier = new CyclicBarrier(
			THREAD_COUNT, new Runnable() {

				@Override
				public void run() {
					System.out.println("All threads executed ...");
				}
			});

	public static void main(String[] args) {
		Thread t = null;
		for (int i = 0; i < THREAD_COUNT; i++) {
			t = new Thread(new Task(cyclicBarrier), "Thread " + (i + 1));
			t.start();
		}

	}

	private static class Task implements Runnable {

		CyclicBarrier barrier;

		public Task(CyclicBarrier barrier) {
			this.barrier = barrier;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()
					+ " is waiting ");
			try {
				barrier.await();
			} catch (BrokenBarrierException | InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName()
					+ " has crossed the barrier  ");
		}
	}

}
