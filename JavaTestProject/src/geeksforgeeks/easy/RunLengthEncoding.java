package geeksforgeeks.easy;

// http://www.geeksforgeeks.org/run-length-encoding/

public class RunLengthEncoding {
	public static void main(String[] args) {

		String inputStr = "wwwwaaadexxxxxxz";
		String result = lengthEncoding(inputStr);
		System.out.println(result);

	}

	private static String lengthEncoding(String inputStr) {

		String result = "";
		char c1 = ' ';
		char c2 = ' ';
		int count = 1;

		for (int i = 0; i < inputStr.length(); i++) {

			c1 = inputStr.charAt(i);
			
			if (i + 1 <= inputStr.length() - 1) {
				c2 = inputStr.charAt(i + 1);
			}else {
				c2=c1;
				result = result + c1 + count;
				count = 1;
			}
				if (c1 != c2) {
					result = result + c1 + count;
					count = 1;
				} else if (c1 == c2) {
					count++;
				}
		}

		return result;
	}
}
