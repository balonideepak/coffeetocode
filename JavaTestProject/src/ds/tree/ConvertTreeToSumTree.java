package ds.tree;

public class ConvertTreeToSumTree {

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(-2);
		root.right = new Node(6);
		root.left.left = new Node(8);
		root.left.right = new Node(-4);
		root.right.left = new Node(7);
		root.right.right = new Node(5);

		toSumTree(root);

		printInorder(root);

	}

	private static int toSumTree(Node node) {
		if (null == node) {
			return 0;
		}
		int old_val = node.data;
		node.data = toSumTree(node.left) + toSumTree(node.right);
		return node.data  + old_val;
	}

	static void printInorder(Node node) {
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}
}
