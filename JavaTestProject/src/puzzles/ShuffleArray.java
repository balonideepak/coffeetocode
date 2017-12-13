package puzzles;

import java.util.Random;

public class ShuffleArray {

	/********* USE the approach of Fisher–Yates shuffle algorithm ***********/
	/****** the algorithm's time complexity is O(n), **********/

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 4:05:30 PM
	 */
	public static void main(String[] args) {
		ShuffleArray obj = new ShuffleArray();
		obj.shuffleArray();

	}

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 4:07:02PM
	 */
	private void shuffleArray() {
		int[] intArr = { 1, 2, 3, 4, 5, 6 };
		int arrLength = intArr.length - 1;
		for (int i = arrLength; i >= 0; i--) {
			Random random = new Random();
			int randomIndex = random.nextInt(arrLength);
			swap(intArr, i, randomIndex);

		}
		for (int intValue : intArr) {
			System.out.println(intValue);
		}
	}

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 4:35:47 PM
	 */
	private void swap(int intArr[], int lastIndexInTheRange,
			int randomPickedIndexInTheRange) {
		int temp = 0;
		temp = intArr[lastIndexInTheRange];
		intArr[lastIndexInTheRange] = intArr[randomPickedIndexInTheRange];
		intArr[randomPickedIndexInTheRange] = temp;
	}
}
