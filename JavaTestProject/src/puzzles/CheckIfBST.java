/**
 * 
 */
package puzzles;

/**
 * @author deepak.baloni
 * 
 */
public class CheckIfBST {

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 2:45:32 PM
	 */
	public static void main(String[] args) {
		// ------ 4
		// ---2---------6
		// 1----3------5----7

		Tree tree = new Tree(4);

		tree.left = new Tree(2);
		tree.right = new Tree(6);

		tree.left.left = new Tree(1);
		tree.left.right = new Tree(3);

		tree.right.left = new Tree(5);
		tree.right.right = new Tree(7);

		boolean ifBST = ifBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);

		System.out.println("The Tree is BST ? : " + ifBST);
	}

	/**
	 * @param maxValue
	 * @param minValue
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 2:52:34 PM
	 */
	private static boolean ifBST(Tree tree, int minValue, int maxValue) {

		if (null == tree)
			return true;

		if (tree.value > minValue && tree.value < maxValue) {

			boolean ifLeftBST = ifBST(tree.left, minValue, tree.value);
			boolean ifRightBST = ifBST(tree.right, tree.value, maxValue);

			return ifLeftBST & ifRightBST;
		}

		return false;
	}

	static class Tree {
		Tree left;
		Tree right;
		int value;

		/**
		 * 
		 */
		public Tree(int value) {
			this.value = value;
		}
	}

}
