package ds.stack;

public class SortStackElems {
	private static int inputArr[] = { 34, 3, 12, 56, 1 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackX<Integer> stack = new StackX<>(inputArr.length);
		for (int i : inputArr) {
			stack.push(i);
		}
		StackX<Integer> sortedStack = sortStack(stack);
		while (!sortedStack.isEmpty()) {
			System.out.println(sortedStack.pop());
		}
	}

	private static StackX<Integer> sortStack(StackX<Integer> stack) {
		StackX<Integer> tempStack = new StackX<>(inputArr.length);

		while (!stack.isEmpty()) {
			int elem = stack.pop();
			while (!tempStack.isEmpty() && elem < tempStack.peek()) {
				stack.push(tempStack.pop());
			}
			tempStack.push(elem);
		}

		return tempStack;
	}

}
