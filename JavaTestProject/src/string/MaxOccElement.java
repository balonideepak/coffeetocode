package string;

public class MaxOccElement {

	public static void main(String[] args) {
		String str = "test string";
		int[] arr = new int[255];
		int maxCount = 0;
		char maxOccChar = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (arr[charAt] == 0) {
				arr[charAt] = 1;
			} else {
				int count = arr[charAt];
				arr[charAt] = ++count;
				if (maxCount < count) {
					maxCount = count;
					maxOccChar = charAt;
				}
			}
		}

		System.out.println(maxCount + " , " + maxOccChar);
	}

}
