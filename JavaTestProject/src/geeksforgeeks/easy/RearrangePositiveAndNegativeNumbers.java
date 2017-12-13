package geeksforgeeks.easy;

/*
 * http://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/ 
 */

public class RearrangePositiveAndNegativeNumbers {
	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		rearrange(arr);
		System.out.println("Rearranged elements");
		printArray(arr);
	}

	private static void rearrange(int[] arr) {
		int i = -1;
		int temp = 0;
		for (int j = 0; j < arr.length; j++) {

			if (arr[j] < 0) {
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}

		}

		System.out
				.println("After all  negatives on left side and positives on right side");
		printArray(arr);
		

		int negPosition = 0;
		int posPosition = i + 1;

		while (negPosition < posPosition && posPosition < arr.length
				&& arr[negPosition] < 0) {

			temp = arr[negPosition];
			arr[negPosition] = arr[posPosition];
			arr[posPosition] = temp;

			negPosition += 2;
			posPosition += 2;
		}

	}

	private static void printArray(int[] arr) {

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();

	}

}
