package ds.tree.traversal;

public class InOrder {
	private static TreeNode root = null;
	private static int arr[] = { 30, 70, 20, 40, 60, 80 };

	public static void main(String[] args) {
		root = new TreeNode(50);
		for (int i = 0; i < arr.length; i++) {
			createTree(root, arr[i]);
		}

		printInOrder(root);
	}

	private static void createTree(TreeNode node, int val) {

		if (null == node) {
			return;
		}

		if (val < node.val) {

			if (null == node.left) {
				node.left = new TreeNode(val);
			}

			createTree(node.left, val);

		} else if (val > node.val) {

			if (null == node.right) {
				node.right = new TreeNode(val);
			}

			createTree(node.right, val);
		}

	}

	private static void printInOrder(TreeNode node) {

		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.val +" ");
		printInOrder(node.right);

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}
}