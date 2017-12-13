package geeksforgeeks;

public class SegregateEvenAndOddNumbers {
	private static int inputarr1[] = { 12, 34, 45, 9, 8, 90, 3 };
	private static int inputarr2[] = { 12, 34, 45, 9, 8, 90, 3 };

	public static void main(String[] args) {
		segEvenAndOddMethod1();
		segEvenAndOddMethod2();

		printArr();
	}

	private static void segEvenAndOddMethod1() {

		int left = 0;
		int right = inputarr1.length - 1;
		while (left < right) {

			while (inputarr1[left] % 2 == 0 && left < right) {
				left++;
			}

			while (inputarr1[right] % 2 != 0 && left < right) {
				right--;
			}

			if (left < right) {
				int temp = inputarr1[left];
				inputarr1[left] = inputarr1[right];
				inputarr1[right] = temp;
				left++;
				right--;
			}

		}
	}

	private static void segEvenAndOddMethod2() {

		int current = inputarr2[0];
		int forward = inputarr2[1];
		int temp = 0;
		int pointer = 0;
		if (forward % 2 == 0 && current % 2 != 0) {
			temp = inputarr2[0];
			inputarr2[0] = inputarr2[1];
			inputarr2[1] = temp;
		}

		for (int i = 1; i < inputarr2.length - 1;) {
			forward = inputarr2[i + 1];
			current = inputarr2[i];
			if (forward % 2 == 0 && current % 2 != 0 && pointer == 0) {
				temp = inputarr2[i];
				inputarr2[i] = inputarr2[i + 1];
				inputarr2[i + 1] = temp;
			}
			if (forward % 2 != 0 && current % 2 != 0) {
				if (pointer == 0) {
					pointer = i;
				}
			}

			if (pointer != 0 && current % 2 == 0) {
				temp = inputarr2[pointer];
				inputarr2[pointer] = inputarr2[i];
				inputarr2[i] = temp;
				i = pointer + 1;
				pointer = 0;
				continue;
			}
			i++;

		}

	}

	private static void printArr() {

		System.out.println("\n Printing array1....");
		for (int i : inputarr1) {
			System.out.print(i + " ");
		}

		System.out.println("\n Printing array2....");
		for (int i : inputarr2) {
			System.out.print(i + " ");
		}
	}

}
