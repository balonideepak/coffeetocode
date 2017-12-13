package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

//http://www.geeksforgeeks.org/majority-element/
//https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm

/*
 A majority element in an array A[] of size n is an element that 
 appears more than n/2 times (and hence there is at most one such element).
 */
public class FindMajorityElement {

	private static int arr[] = new int[] { 1, 3, 3, 1, 1, 2 };
	private static int length = arr.length;

	public static void main(String[] args) {

		hashMapApproach();

		boyerMooreApproach();

	}

	private static void hashMapApproach() {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			Integer val = map.get(i);
			if (val != null) {
				map.put(i, val + 1);
				if (val + 1 >= length / 2) {
					System.out.println("majority elem=" + i);
					return;
				}
			} else
				map.put(i, 1);
		}

		System.out.println("[Info] hashMapApproach()  No majority elem");
	}

	private static void boyerMooreApproach() {

	}

}
