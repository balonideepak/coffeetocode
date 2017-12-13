/**
 * 
 */
package puzzles;

import java.util.Stack;

/**
 * @author deepak.baloni
 * 
 */
public class ArithmeticTreeExpression {

	private static Stack<Integer> values = new Stack<Integer>();

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 5:05:34 PM
	 */
	public static void main(String[] args) {

		// ------ +
		// ---*---------*
		// 2----3------4------5
		Tree tree = new Tree("+");

		tree.left = new Tree("*");
		tree.right = new Tree("*");

		tree.left.left = new Tree("2");
		tree.left.right = new Tree("3");

		tree.right.left = new Tree("4");
		tree.right.right = new Tree("5");

		compute(tree);

		System.out.println("  Final Value is : " + values.pop());
	}

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 5:13:29 PM
	 */
	private static void compute(Tree tree) {

		if (null != tree) {

			compute(tree.left);
			compute(tree.right);

			if (!ifOperator(tree.value)) {

				values.push(Integer.parseInt(tree.value));

			} else {
				int b = values.pop();
				int a = values.pop();
				char op = tree.value.charAt(0);
				int tempValue = computeResult(op, a, b);
				values.push(tempValue);
			}
		}
	}

	private static boolean ifOperator(String operator) {

		return "+".equals(operator) || "-".equals(operator)
				|| "*".equals(operator) || "/".equals(operator);
	}

	public static int computeResult(char operator, int a, int b) {

		switch (operator) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;

		}
		return -1;
	}

}

class Tree {
	Tree left;
	Tree right;
	String value;

	/**
	 * 
	 */
	public Tree(String value) {
		this.value = value;
	}
}
