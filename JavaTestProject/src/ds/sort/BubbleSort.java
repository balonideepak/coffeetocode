package ds.sort;

public class BubbleSort {

	private static int[] arr = { 1, 9, 5, 7, 2, 3 };

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
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
