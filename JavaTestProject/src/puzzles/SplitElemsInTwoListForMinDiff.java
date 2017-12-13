package puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitElemsInTwoListForMinDiff {
	private static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		testCase1();
		testCase2();

	}

	private static void testCase1() {
		list.clear();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Collections.sort(list);
		System.out.println("Testing for test case 1 , input list : "+list);
		createSplittedList();

	}
	
	private static void testCase2() {
		list.clear();
		list.add(1);
		list.add(10);
		list.add(11);
		list.add(15);
		Collections.sort(list);
		System.out.println("Testing for test case 2 , input list : "+list);
		createSplittedList();

	}

	private static void createSplittedList() {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int size = list.size();
		list1.add(list.get(0));
		list2.add(list.get(size - 1));

		for (int i = 1; i < size - 1; i++) {
			int list1Sum = sumListElem(list1);
			int list2Sum = sumListElem(list2);
			Integer elem = list.get(i);
			int diff1 = (list1Sum + elem) - list2Sum;
			list1Sum = sumListElem(list1);
			list2Sum = sumListElem(list2);
			int diff2 = list1Sum - (list2Sum + elem);

			if (diff1 < 0)
				diff1 = -1 * diff1;

			if (diff2 < 0)
				diff2 = -1 * diff2;

			if (diff1 < diff2) {
				list1.add(elem);
			} else {
				list2.add(elem);
			}
		}

		System.out.println("First list=" + list1);
		System.out.println("Second list=" + list2);

	}

	private static int sumListElem(List<Integer> list) {
		int sum = 0;
		for (int elem : list) {
			sum = sum + elem;
		}
		return sum;
	}

}
