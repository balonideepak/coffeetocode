package geeksforgeeks.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 6, 7 };
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		list1 = combinationSum(arr, 7);
		for (int i = 0; i < list1.size(); i++) {
			List<Integer> temp = new ArrayList<Integer>();
			temp = list1.get(i);
			System.out.println(temp);
		}
	}

	public static List<List<Integer>> combinationSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, target, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list,
			List<Integer> tempList, int[] nums, int remain, int start) {
		if (remain < 0)
			return;
		else if (remain == 0)
			list.add(new ArrayList<>(tempList));
		else {
			for (int i = start; i < nums.length; i++) {
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain - nums[i], i); // not i +
																		// 1
																		// because
																		// we
																		// can
																		// reuse
																		// same
																		// elements
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}