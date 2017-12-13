package geeksforgeeks.easy;

public class IsSumTree {
	public static void main(String[] args) {

		Node root = new Node(60);
		root.left = new Node(25);
		root.right = new Node(35);
		root.left.left = new Node(25);
		root.left.right = new Node(5);
		root.right.left = new Node(18);
		root.right.right = new Node(17);

		boolean sumTree = isSumTree(root);
		System.out.println(sumTree);

	}

	private static boolean isSumTree(Node node) {

		if (null == node || (node.left == null && node.right == null)) {
			return true;
		}

		isSumTree(node.left);

		return true;
	}

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}
}
