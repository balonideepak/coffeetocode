package ds.heap;

//http://www.geeksforgeeks.org/merge-two-binary-max-heaps/

public class MergeTwoHeaps {
	public static void main(String[] args) {

		int arr1[] = { 10, 5, 6, 2 };
		int arr2[] = { 12, 7, 9 };

		int n = arr1.length;
		int m = arr2.length;
		int newArr[] = new int[n + m];

		for (int i = 0; i < n; i++) {
			newArr[i] = arr1[i];
		}

		for (int i = 0; i < m; i++) {
			newArr[n + i] = arr2[i];
		}

		for (int i = newArr.length / 2 - 1; i >= 0; i--)
			percolateDown(newArr, newArr.length, i);

		printArray(newArr);

	}

	private static void printArray(int[] newArr) {

		for (int val : newArr) {
			System.out.println(val);
		}

	}

	private static void percolateDown(int[] newArr, int n, int i) {

		if (i >= n) {
			return;
		}

		int left = getLeft(i, n);
		int right = getRight(i, n);
		int max = 0;
		int temp;

		if (left != -1 && newArr[left] > newArr[i]) {
			max = left;
		} else {
			max = i;
		}

		if (right != -1 && newArr[right] > newArr[max]) {
			max = right;
		}

		if (max != i) {
			temp = newArr[i];
			newArr[i] = newArr[max];
			newArr[max] = temp;
			percolateDown(newArr, n, max);
		}

	}

	private static int getLeft(int i, int n) {
		int left = 2 * i + 1;
		if (left >= n) {
			return -1;
		}
		return left;
	}

	private static int getRight(int i, int m) {
		int right = 2 * i + 2;
		if (right >= m) {
			return -1;
		}
		return right;
	}

}
