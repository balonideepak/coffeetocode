package ds.stack;

public class ImplementQueueUsingStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackX<Character> stack1 = new StackX<>(5);
		StackX<Character> stack2 = new StackX<>(5);

		char[] inputChar = new char[] { 'a', 'b', 'c' };
		for (char c : inputChar) {
			if (stack1.isEmpty()) {
				stack1.push(c);
			} else {
				while (!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
				stack1.push(c);

				while (!stack2.isEmpty()) {
					stack1.push(stack2.pop());
				}
			}
		}

		while (!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}

	}

}
