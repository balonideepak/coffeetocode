package thread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		producer.start();
		consumer.start();
	}

}
