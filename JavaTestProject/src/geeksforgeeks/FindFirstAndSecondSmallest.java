package geeksforgeeks;

//http://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
public class FindFirstAndSecondSmallest {

	private static int arr[] = { 5, 3, 1, 2, 9 };

	public static void main(String[] args) {
		findFirstAndSecondSmallest();
	}

	private static void findFirstAndSecondSmallest() {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}

		}

		if (second == Integer.MAX_VALUE) {
			System.out.println("Second smallest not found");
		} else {
			System.out.println("First smallest =" + first
					+ " second smallest =" + second);
		}

	}

}
