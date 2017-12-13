package collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
	private final BlockingQueue queue;

	Producer(BlockingQueue q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				queue.put(produce());
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();

		}
	}

	Object produce() {
		System.out.println("Current thread ::"
				+ Thread.currentThread().getName() + " is producing.... ");
		return new String("Dummy Value");
	}
}
