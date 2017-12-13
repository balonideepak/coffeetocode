package ds.heap;

public class HeapDemo {
	// here 1 is inserted and we have to heapify
	private static int arr[] = { 31, 1, 21, 5, 10, 12, 18, 3, 2, 8, 7 };

	public static void main(String[] args) {
		percolateDown(1);// passed the index of 1
		// printing array after heapifying
		for (int i : arr) {
			System.out.print(i + " , ");
		}
	}

	private static void percolateDown(int i) {
		int l = getLeftChildIndex(i);
		int r = getRightChildIndex(i);

		int max = 0;
		int temp = 0;

		if (l != -1 && arr[l] > arr[i]) {
			max = l;
		} else {
			max = i;
		}

		if (r != -1 && arr[r] > arr[max]) {
			max = r;
		}

		if (max != i) {
			temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			percolateDown(max);
		}

	}

	private static int getLeftChildIndex(int i) {
		int index = 2 * i + 1;
		if (i < 0 || index >= arr.length) {
			return -1;
		}
		return index;
	}

	private static int getRightChildIndex(int i) {
		int index = 2 * i + 2;
		if (i < 0 || index >= arr.length) {
			return -1;
		}
		return index;
	}

}
