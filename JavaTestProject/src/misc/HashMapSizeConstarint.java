package misc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class HashMapSizeConstarint {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 1 };
		int capacity = 3;
		int pagefaults = 0;
		Set<Integer> set = new HashSet<Integer>();
		Queue<Integer> queue = new LinkedList<>();
		int val;
		for (int data : intArr) {
			if (set.size() < capacity) {
				if (!set.contains(data)) {
					set.add(data);
					queue.add(data);
					pagefaults++;
				}
			} else {
				if (!set.contains(data)) {
					val = queue.peek();

					set.remove(val);
					queue.poll();

					set.add(data);
					queue.add(data);

					pagefaults++;
				}
			}
		}

		System.out.println("PageFaults =" + pagefaults);
		printFifoQueue(queue);
	}

	private static void printFifoQueue(Queue<Integer> queue) {
		System.out.println("Printing FIFO queue....");
		Iterator<Integer> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
