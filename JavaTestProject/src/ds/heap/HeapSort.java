package ds.heap;

public class HeapSort {
	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6, 7 };
		sort(arr);
	}

	private static void sort(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		printArray(arr);

		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
		
		
		System.out.println();
		printArray(arr);
	}

	private static void heapify(int arr[], int n, int i) {
		int l, r, max, temp = 0;
		l = 2 * i + 1;
		r = 2 * i + 2;
		max = i;
		if (l < n && arr[l] > arr[max]) {
			max = l;
		}

		if (r < n && arr[r] > arr[max]) {
			max = r;
		}

		if (max != i) {
			temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			heapify(arr, n, max);
		}
	}

	private static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}