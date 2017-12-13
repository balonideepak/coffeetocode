package ds.sort;

public class SelectionSort {
	private static int[] arr = { 1, 9, 5, 7, 2, 3, 4 };

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			int smallestIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
		}
		print();
	}

	private static void print() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
