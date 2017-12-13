package geeksforgeeks.easy;

public class FillArrayWith1s {
	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1 };

		// arr[] = {1, 0, 1, 0, 0, 1, 0, 1,1, 0, 1, 1, 0, 0, 1}

		// int arr[] = {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0};

		int leftVal = 0;
		int rightVal = 0;

		int maxDis = 0;
		int localDis = 0;

		int leftIndex;
		int rightIndex;

		for (int i = 1; i < arr.length; i++) {

			leftIndex = i - 1;
			rightIndex = i + 1;

			if (arr[i] == 1) {
				continue;
			}

			if (rightIndex == arr.length) {
				while (leftIndex >= 0) {

					leftVal = arr[leftIndex];

					if (leftVal == 1) {
						localDis = i - leftIndex;
						if (localDis > maxDis) {
							maxDis = localDis;
						}
						break;
					}

					if (localDis > maxDis) {
						maxDis = localDis;
					}

					leftIndex--;

				}

			} else {
				while (leftIndex >= 0 && rightIndex < arr.length) {

					leftVal = arr[leftIndex];
					rightVal = arr[rightIndex];

					if (leftVal == 1) {
						localDis = i - leftIndex;
						if (localDis > maxDis) {
							maxDis = localDis;
						}
						break;
					} else if (rightVal == 1) {
						if (localDis > maxDis) {
							maxDis = localDis;
						}
						localDis = rightIndex - i;
						break;
					} else {
						localDis = Math.min(i - leftIndex, rightIndex - i);
					}

					if (localDis > maxDis) {
						maxDis = localDis;
					}

					leftIndex--;
					rightIndex++;

				}
			}

		}

		System.out.println(maxDis);

	}
}
