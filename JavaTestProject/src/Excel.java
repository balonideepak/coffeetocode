public class Excel {
	private static char charArr[] = new char[26];
	private static int index = 0;

	public static void main(String[] args) {
		System.out.println(53 % 26);
		System.out.println(27 / 26);

		getString(27);

	}

	private static void getString(int n) {

		while (n > 0) {

			int rem = n % 26;
			if (rem == 0) {
				charArr[index++] = 'Z';
				n = (n/26)-1;
			} else {
				charArr[index++] = (char) (rem-1 + (int) 'A');
				n = n / 26;
			}

			

		}
		
		
		System.out.println(new String(charArr));

	}
}
