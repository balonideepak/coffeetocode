package ds.stack;

import java.util.Scanner;

public class QueueImplByStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Please provide the string .....");
		System.out.println("---------------------------------------");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		int size = inputString.length();

		StackX<Character> firstStack = new StackX<Character>(size);
		StackX<Character> secondStack = new StackX<Character>(size);

		char[] charArray = inputString.toCharArray();
		StackX<Character> emptyStack = null;
		StackX<Character> fullStack = null;

		for (char c : charArray) {
			if (firstStack.isEmpty() && secondStack.isEmpty()) {
				firstStack.push(c);
				continue;
			}

			if (firstStack.isEmpty()) {
				emptyStack = firstStack;
				fullStack = secondStack;
			} else {
				emptyStack = secondStack;
				fullStack = firstStack;
			}

			while (!fullStack.isEmpty()) {
				emptyStack.push(fullStack.pop());
			}
			emptyStack.push(c);

			while (!emptyStack.isEmpty()) {
				fullStack.push(emptyStack.pop());
			}

		}

		for (int i = 0; i < size; i++) {
			System.out.print(fullStack.pop());
		}

		in.close();

	}

}
