package ds.sort;

public class InsertionSort {
	private static int[] arr = { 1, 9, 5, 7, 2, 3, 4 };

	public static void main(String[] args) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}

		print();
	}

	private static void print() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
