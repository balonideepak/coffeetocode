package geeksforgeeks;

// http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class MaximumContiguousSubArraySum {

	public static void main(String[] args) {
		// int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		// int arr[] = { -1, -1, -1, -1, -1, -1, -1, -1 };
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, -1, -1, -1, -1, -1, -1, -1, -1 };

		int maxSum = arr[0];
		int maxEndingHere = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxEndingHere = maxEndingHere + arr[i];
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}

			if (maxSum < maxEndingHere) {
				maxSum = maxEndingHere;
			}

		}

		System.out.println("Max sum=" + maxSum);

	}

}
