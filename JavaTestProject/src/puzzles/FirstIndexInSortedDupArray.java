package puzzles;

public class FirstIndexInSortedDupArray {
	public static void main(String[] args) {

		int[] intArr = { 1, 1, 2, 2, 2, 2 ,2};
		int search = 2;
		int firstIndex = getFirstIndex(intArr, search, 0, intArr.length-1);
		System.out.println("First Index of ::"+search+" is "+firstIndex);

	}

	private static int getFirstIndex(int[] intArr, int a, int startIndex,
			int endIndex) {

		if (endIndex < startIndex)
			return -1;
		if (intArr[startIndex] > a)
			return -1;
		if (intArr[endIndex] < a)
			return -1;
		if (intArr[startIndex] == a)
			return startIndex;

		int mid = (startIndex + endIndex) / 2;

		if (intArr[mid] == a) {// two cases >>> either middle one is the element
								// or the element is in left half
			int leftIndex = getFirstIndex(intArr, a, startIndex, mid - 1);
			return leftIndex == -1 ? mid : leftIndex;
		} else if (intArr[mid] > a) {
			return getFirstIndex(intArr, a, startIndex, mid - 1);
		} else {
			return getFirstIndex(intArr, a, mid + 1, endIndex);
		}

	}
}
