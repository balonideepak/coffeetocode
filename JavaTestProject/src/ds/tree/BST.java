package ds.tree;

public class BST {

	private static int arr[] = { 2, 3, 4, 10, 40 };

	public static void main(String[] args) {
		int itemToSearch = 3;
		int index = binarySearch(0, arr.length, itemToSearch);
		System.out.println("Position of " + itemToSearch + " =" + index);
	}

	private static int binarySearch(int low, int high, int x) {
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x) {
				high = mid - 1;
				binarySearch(low, high, x);

			} else if (arr[mid] < x) {
				low = mid + 1;
				binarySearch(low, high, x);
			}

		}

		return -1;
	}

}
