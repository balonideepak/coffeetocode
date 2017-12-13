package geeksforgeeks.easy;

import java.util.Arrays;

public class CountTripletsWithSumSmaller {
	public static void main(String[] args) {
		int arr[] = new int[] { 5, 1, 3, 4, 7 };
		int n = arr.length;
		int sum = 12;
		int ans = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n - 2; i++) {
			// Initialize other two elements as corner elements
			// of subarray arr[j+1..k]
			int j = i + 1, k = n - 1;

			// Use Meet in the Middle concept
			while (j < k) {
				// If sum of current triplet is more or equal,
				// move right corner to look for smaller values
				if (arr[i] + arr[j] + arr[k] >= sum)
					k--;
				else {
					ans += (k - j);
					j++;
				}
			}
		}
		System.out.println(ans);

	}
}
