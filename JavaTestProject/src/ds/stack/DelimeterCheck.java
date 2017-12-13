package ds.stack;

import java.util.Scanner;

public class DelimeterCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Input : {([])}
		Scanner in = new Scanner(System.in);
		System.out.println("Please provide the string ");
		System.out.println("------------------------------------------------");
		String inputString = in.nextLine();
		char charArr[] = inputString.toCharArray();

		StackX stackObj = new StackX(inputString.length());

		for (char c : charArr) {
			if ('{' == c || '[' == c || '(' == c) {
				stackObj.push(c);
			} else if ('}' == c || ']' == c || ')' == c) {
				if (!stackObj.isEmpty()) {
					char pop = (char) stackObj.pop();
					if (c=='}' && pop=='{' || c==']' && pop=='[' || c==')' && pop=='(' ) {
						System.out.println("Check validated for closing delimeter '"+c + "' and its respective opening delimeter");
					}
					else{
						throw new RuntimeException(
								"Delimeters pairs are not proper , please check the provided string .");
					}
				}
			}

		}
		
		if(!stackObj.isEmpty()){
			System.out.println("[ERROR]: Delimeter check failed");
		}

	}
}
