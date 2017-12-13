package geeksforgeeks;

//http://n00tc0d3r.blogspot.in/2013/03/flatten-binary-tree-to-linked-list-in.html

public class FlattenBinaryTreeToLinkedList {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		flatten(root);
		while (root != null) {
			System.out.println(root.val);
			root = root.right;
		}
	}

	private static TreeNode flatten(TreeNode node) {

		if (node == null)
			return node;

		TreeNode left = node.left;
		TreeNode right = node.right;

		if (left != null) {
			node.right = left;
			node.left = null;
			node = flatten(node.right);

		}

		if (right != null) {
			node.right = right;
			node = flatten(node.right);
		}

		return node;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			super();
			this.val = val;
		}

		@Override
		public String toString() {
			return "TreeNode [val=" + val + "]";
		}

	}
}
