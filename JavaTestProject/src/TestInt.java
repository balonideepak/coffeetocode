public class TestInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sentence = "hello how are you hari";
		sentence=sentence.replaceAll("\\s+", "");
		char charval;
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			charval = sentence.charAt(i);
			count = 1;
			for (int j = i + 1; j < sentence.length(); j++) {
				if (charval == sentence.charAt(j)) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println("Got first repeating '" + charval
						+ "' character with count =" + count);
				count = 0;
				break;
			}
		}

		int start = sentence.length() - 1;
		for (int i = start; i > 0; i--) {
			charval = sentence.charAt(i);
			count = 1;
			for (int j = i - 1; j > 0; j--) {
				if (charval == sentence.charAt(j)) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println("Got last repeating '" + charval
						+ "' character with count =" + count);
				count = 0;
				break;
			}
		}

	}

}
