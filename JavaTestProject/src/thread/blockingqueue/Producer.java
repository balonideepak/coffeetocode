package thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue queue = null;
	private int i;

	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				i++;
				System.out.println("Put i=" + i);
				queue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
