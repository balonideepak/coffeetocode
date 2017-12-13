package greedy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FIFOPageReplacement {
	public static void main(String[] args) {
		int pages[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };
		int capacity = 4;
		int pageFaults = getPageFaults(pages, capacity);
		System.out.println(pageFaults);
	}

	private static int getPageFaults(int[] pages, int capacity) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		int pageFaults = 0;

		for (int i = 0; i < pages.length; i++) {

			if (set.size() < capacity) {
				if (!set.contains(pages[i])) {
					set.add(pages[i]);
					queue.add(pages[i]);
					pageFaults++;
				}

			} else {
				if (!set.contains(pages[i])) {
					Integer remove = queue.poll();
					set.remove(remove);
					set.add(pages[i]);
					queue.add(pages[i]);
					pageFaults++;
				}

			}

		}

		return pageFaults;
	}
}
