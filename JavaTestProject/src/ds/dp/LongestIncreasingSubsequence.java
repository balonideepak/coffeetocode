package ds.dp;

import java.util.Arrays;

//http://www.geeksforgeeks.org/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {
	public static void main(String[] args) {

		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		// int[] arr={3, 10, 2, 1, 20};
		int globalmax = 1;
		int length = arr.length;
		int[] sol = new int[length];
		Arrays.fill(sol, 1);

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					int val = sol[i];
					if (sol[j] + 1 > val) {
						sol[i] = sol[j] + 1;
					}
				}
			}

			if (globalmax < sol[i]) {
				globalmax = sol[i];
			}
		}
		System.out.println(globalmax);
	}
}
