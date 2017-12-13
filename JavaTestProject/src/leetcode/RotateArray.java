package leetcode;

public class RotateArray {

	private static int[] arrInput1 = { 1, 2, 3, 4, 5, 6 };
	private static int rotateCount = 3;

	public static void main(String[] args) {
		approach1();
		approach2();
	}

	private static void approach1() {
		if (rotateCount == 0 || arrInput1 == null) {
			return;
		}

		int length = arrInput1.length;
		int arr[] = new int[length];
		int start = length - rotateCount;
		for (int i = start; i < length; i++) {
			arr[i - start] = arrInput1[i];
		}

		for (int i = 0; i < rotateCount; i++) {
			arr[i + start] = arrInput1[i];
		}

		System.out.println("Output of approach1....");
		for (int x : arr) {
			System.out.print(x);
		}
		System.out.println();
	}

	// Kind of bubble sort
	private static void approach2() {
		int temp;
		for (int i = 0; i < rotateCount; i++) {
			for (int j = arrInput1.length - 1; j > 0; j--) {
				temp = arrInput1[j];
				arrInput1[j] = arrInput1[j - 1];
				arrInput1[j - 1] = temp;
			}
		}

		System.out.println("Output of approach2....");

		for (int x : arrInput1) {
			System.out.print(x);
		}
	}

}
