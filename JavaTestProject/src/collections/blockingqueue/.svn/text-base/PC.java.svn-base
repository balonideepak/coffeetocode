package collections.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PC {
	public static void main(String[] arg) {
		BlockingQueue q = new ArrayBlockingQueue(1024);
		Producer p = new Producer(q);
		Consumer c1 = new Consumer(q);
		Consumer c2 = new Consumer(q);
		new Thread(p).start();
		new Thread(c1).start();
		new Thread(c2).start();
	}
}
