package puzzles.programminginterviews;

public class ParenthesisPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		printParenthesis(2, 2, "");

	}

	private static void printParenthesis(int leftRemain, int rightRemain,
			String currentString) {

		if (rightRemain == 0) {
			System.out.println(currentString);
			return;
		}

		if (leftRemain > 0) {
			printParenthesis(leftRemain - 1, rightRemain, currentString + "(");

			if (leftRemain < rightRemain) {
				printParenthesis(leftRemain, rightRemain - 1, currentString
						+ ")");
			}
		} else {
			printParenthesis(leftRemain, rightRemain - 1, currentString + ")");
		}

	}

}
