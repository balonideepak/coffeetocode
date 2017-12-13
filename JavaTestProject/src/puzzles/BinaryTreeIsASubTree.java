/**
 * 
 */
package puzzles;

/**
 * @author deepak.baloni
 * 
 */
public class BinaryTreeIsASubTree {

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 10:31:55 AM
	 */
	public static void main(String[] args) {

		// 1
		// 2 -3
		// --4 5
		BinaryTree t1 = new BinaryTree(1);
		t1.left = new BinaryTree(2);
		t1.right = new BinaryTree(3);
		t1.right.left = new BinaryTree(4);
		t1.right.right = new BinaryTree(5);

		BinaryTree t2 = new BinaryTree(3);
		t2.left = new BinaryTree(4);
		t2.right = new BinaryTree(5);

		if (ifSubTreeVAl(t1, t2)) {

			System.out.println("T2 is a subtree of T1 (VAL)");
		} else {
			System.out.println("T2 is not a subtree of T1 (VAL)");
		}

	}

	public static boolean ifSubTreeVAl(BinaryTree t1, BinaryTree t2) {

		if (t2 == null)
			return true;
		if (t1 == null)
			return false;

		return equals(t1,t2) || ifSubTreeVAl(t1.left, t2)
				|| ifSubTreeVAl(t1.right, t2);
	}
	
	
	public static boolean equals(BinaryTree n1, BinaryTree n2) {
		if (n1 == n2)
			return true;
		if (n1 == null || n2 == null)
			return false;
		if (n1.value != n2.value)
			return false; // Should use .equals if Node.data isn't primitive
		return equals(n1.left, n2.left) && equals(n1.right, n2.right);
	}

}

class BinaryTree {
	BinaryTree left;
	BinaryTree right;
	int value;

	/**
	 * 
	 */
	public BinaryTree(int value) {
		this.value = value;
	}

	

}
