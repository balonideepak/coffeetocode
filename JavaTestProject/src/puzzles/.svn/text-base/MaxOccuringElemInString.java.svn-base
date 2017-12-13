package puzzles;

public class MaxOccuringElemInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "test string ";
		int[] countarr = new int[255];
		int max=0;
		char maxoccur_char = 0;
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);

			if (countarr[x] >= 1) {
				int temp = countarr[x];
				countarr[x] = temp + 1;

				if (temp > max) {
					max = temp;
					maxoccur_char = x;
				}
			} else {
				countarr[x] = 1;
			}
		}
		
		System.out.println("max occuring char is "+maxoccur_char+" , and count is "+max);
	}

}
