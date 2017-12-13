package ds.stack;

import java.util.Scanner;

public class ReverseAWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Input string : part
		// Output string : trap

		System.out.println("Please provide string to be reversed....");
		System.out.println("--------------------------------------------------------");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		char charArr[] = inputString.toCharArray();

		StackX stackObj = new StackX(inputString.length());

		for (char c : charArr) {
			stackObj.push(c);
		}

		System.out.println("Reversed string .");
		System.out.println("--------------------------------------------------------");
		while (!stackObj.isEmpty()) {
			System.out.print(stackObj.pop());
		}

	}

}
