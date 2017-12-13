package collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
	private final BlockingQueue queue;

	Consumer(BlockingQueue q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				consume(queue.take());
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	void consume(Object x) {
		System.out.println("Current thread ::"
				+ Thread.currentThread().getName() + " is consuming.... ");

	}
}