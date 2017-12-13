package ds.stack;

public class BalancedParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackX<Character> stack1 = new StackX<>(5);
		// char[] inputCharArray = { '[', '(', ')', ']' };//Input one
		char[] inputCharArray = { '[', '{', ')', ']' };// Input two
		for (char c : inputCharArray) {
			if (c == '[' || c == '{' || c == '(') {
				stack1.push(c);
			} else {
				if (stack1.peek() == '(' && c == ')' || stack1.peek() == '{'
						&& c == '}' || stack1.peek() == '[' && c == ']') {
					System.out.println("Found match for =" + c);
					stack1.pop();
				} else {
					System.out.println("Parentheses are not balanced....");
					System.out.println("Exiting............");
					break;
				}
			}
		}

		if (stack1.isEmpty()) {
			System.out.println("Done.....");
		} else {
			System.out.println("Not valid.");
		}

	}

}
