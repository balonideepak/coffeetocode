package geeksforgeeks;

public class CheckFormajorityElem {
	private static int arr[] = { 1, 2, 3, 3, 3, 3, 10 };
	private static int majElem = 3;

	public static void main(String[] args) {

		boolean majority = isMajority();
		System.out.println("Is elem =" + majElem + " is in majority ="
				+ majority);

	}

	private static boolean isMajority() {
		int n = arr.length;
		int i = binarySearch(0, n - 1);

		if (i == -1) {
			return false;
		}

		if (((i + n / 2) <= (n - 1)) && arr[i + n / 2] == majElem) {
			return true;
		} else {
			return false;
		}
	}

	private static int binarySearch(int low, int high) {

		int mid = 0;
		if (low <= high) {
			mid = (low + high) / 2;

			if ((mid == 0 || majElem > arr[mid - 1]) && (arr[mid] == majElem)) {
				return mid;
			} else if (majElem > arr[mid])
				return binarySearch(mid + 1, high);
			else
				return binarySearch(low, mid - 1);

		}
		return -1;
	}
}
