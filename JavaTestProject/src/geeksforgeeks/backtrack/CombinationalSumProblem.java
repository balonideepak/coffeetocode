package geeksforgeeks.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationalSumProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] candidates = { 2, 4, 6, 8 };
		int target = 8;

		List<List<Integer>> result = combinationSum2(candidates, target);
		System.out.println(result);

		List<List<Integer>> list = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < candidates.length; i++) {
			List<Integer> subList = new ArrayList<>();
			sum = candidates[i];
			subList.add(sum);

			int elemToFind = target - sum;

			for (int j = i + 1; j < candidates.length; j++) {

				if (elemToFind == candidates[j]) {
					subList.add(candidates[j]);
					list.add(subList);
					break;
				}

			}
		}

		System.out.println(list);
	}

	public static List<List<Integer>> combinationSum2(int[] candidates,
			int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> curr = new ArrayList<Integer>();
		Arrays.sort(candidates);
		helper(result, curr, 0, target, candidates);
		return result;
	}

	public static void helper(List<List<Integer>> result, List<Integer> curr,
			int start, int target, int[] candidates) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(curr));
			return;
		}
		if (target < 0) {
			return;
		}

		int prev = -1;
		for (int i = start; i < candidates.length; i++) {
			if (prev != candidates[i]) { // each time start from different
											// element
				curr.add(candidates[i]);
				helper(result, curr, i + 1, target - candidates[i], candidates); // and
																					// use
																					// next
																					// element
																					// only
				curr.remove(curr.size() - 1);
				prev = candidates[i];
			}
		}
	}

}
