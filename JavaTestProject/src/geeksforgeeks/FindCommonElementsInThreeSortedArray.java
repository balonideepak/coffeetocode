package geeksforgeeks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindCommonElementsInThreeSortedArray {

	private static int arr1[] = { 1, 5, 10, 20, 40, 80 };
	private static int arr2[] = { 6, 7, 20, 80, 100 };
	private static int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		Set set = new HashSet();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean add = false;

		for (int i : arr1) {
			if (!set.contains(i)) {
				set.add(i);
				map.put(i, 1);
			}
		}

		set.clear();
		for (int i : arr2) {
			if (!set.contains(i)) {
				set.add(i);
				if (map.get(i) != null)
					map.put(i, map.get(i) + 1);
			}
		}

		set.clear();
		for (int i : arr3) {
			if (!set.contains(i)) {
				set.add(i);
				if (map.get(i) != null)
					map.put(i, map.get(i) + 1);
			}
		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() == 3)
				System.out.println(entry.getKey());
		}

	}

}
