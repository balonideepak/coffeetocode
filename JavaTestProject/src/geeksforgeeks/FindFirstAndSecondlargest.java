package geeksforgeeks;

public class FindFirstAndSecondlargest {
	private static int arr[] = { 5, 3, 1, 2, 9 };

	public static void main(String[] args) {
		findFirstAndSecondLargest();
	}

	private static void findFirstAndSecondLargest() {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && first != arr[i]) {
				second = arr[i];
			}
		}

		if (second != Integer.MIN_VALUE) {
			System.out.println("First greatest number =" + first
					+ " second greatest number is " + second);
		}

	}

}
