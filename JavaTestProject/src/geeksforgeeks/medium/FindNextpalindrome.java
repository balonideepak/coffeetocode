package geeksforgeeks.medium;

//http://www.geeksforgeeks.org/given-a-number-find-next-smallest-palindrome-larger-than-this-number/
public class FindNextpalindrome {
	public static void main(String[] args) {
		// {1,2,2,1} ; { 9, 9, 9, 9 }; { 7, 8, 3, 3, 2, 2 };{7, 1, 3, 3, 2, 2}
		// {1 ,2, 3, 4, 6, 2, 8} ; { 1, 4, 5, 8, 7, 6, 7, 8, 3, 2, 2 }
		int[] arr = { 1, 2, 2, 1 };
		generateNextPalindrome(arr);

	}

	private static void generateNextPalindrome(int[] arr) {

		if (isAll9s(arr)) {
			printAll9sCase(arr);
		} else {
			int[] result = generateNextPalindromeUtil(arr);
			printArr(result);
		}

	}

	private static int[] generateNextPalindromeUtil(int[] arr) {

		int mid = arr.length / 2;

		int i = mid - 1;
		int j = (arr.length % 2 == 0) ? mid : mid + 1;

		while (i >= 0 && arr[i] == arr[j]) {
			i--;
			j++;
		}

		if (i <= 0) {
			i = mid - 1;
			j = (arr.length % 2 == 0) ? mid : mid + 1;
			int carry = 1;

			int temp = arr[i] + 1;

			while (i >= 0) {

				temp = arr[i] + carry;
				if (temp > 9) {
					arr[i] = 0;
					carry = 1;
				} else {
					arr[i] = temp;
					carry = 0;
				}
				arr[j] = arr[i];
				i--;
				j++;
			}
		}

		else {

			if (arr[i] < arr[j]) {

				i = mid - 1;
				j = (arr.length % 2 == 0) ? mid : mid + 1;
				int carry = 1;

				int temp = arr[mid] + carry;
				if (temp > 9) {
					arr[mid] = 0;
					carry = 1;
				} else {
					arr[mid] = temp;
					carry = 0;
				}

				while (i >= 0) {

					temp = arr[i] + carry;
					if (temp > 9) {
						arr[i] = 0;
						carry = 1;
					} else {
						arr[i] = temp;
						carry = 0;
					}
					arr[j] = arr[i];
					i--;
					j++;
				}

			} else {

				while (i >= 0) {
					arr[j] = arr[i];
					i--;
					j++;
				}
			}
		}

		return arr;
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	private static boolean isAll9s(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 9) {
				return false;
			}
		}
		return true;
	}

	private static void printAll9sCase(int[] arr) {

		System.out.print(1);
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(0);
		}
		System.out.print(1);

	}

}
