package greedy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LRU {
	public static void main(String[] args) {
		int pages[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };
		int capacity = 4;
		int pageFaults = getPageFaults(pages, capacity);
		System.out.println(pageFaults);
	}

	private static int getPageFaults(int pages[], int capacity) {

		Set<Integer> set = new HashSet<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int page_faults = 0;

		for (int i = 0; i < pages.length; i++) {

			if (set.size() <= capacity) {
				if (!set.contains(pages[i])) {
					set.add(pages[i]);
					page_faults++;
				}
				map.put(pages[i], i);

			} else {
				if (!set.contains(pages[i])) {

					int LRU = Integer.MAX_VALUE;
					int lval = 0;
					for (Integer val : set) {
						Integer index = map.get(val);
						if (index < LRU) {
							LRU = index;
							lval = val;
						}
					}

					set.remove(lval);
					set.add(pages[i]);
					page_faults++;
				}

				map.put(pages[i], i);
			}
		}

		return page_faults;

	}
}
