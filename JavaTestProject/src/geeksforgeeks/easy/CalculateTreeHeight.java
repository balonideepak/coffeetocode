package geeksforgeeks.easy;

public class CalculateTreeHeight {

	private static int HEIGHT = -1;

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(5);

		System.out.println("Approach 1");
		calculateHeight(root, 1);
		System.out.println("Tree height=" + HEIGHT);

		System.out.println("Approach 2");
		int height = calculateHeight(root);
		System.out.println("Tree height=" + height);
	}

	private static int calculateHeight(Node node, int height) {

		if (null == node) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			if (height > HEIGHT) {
				HEIGHT = height;
			}
		}

		calculateHeight(node.left, height + 1);
		calculateHeight(node.right, height + 1);

		return -1;
	}

	private static int calculateHeight(Node node) {
		if (node == null) {
			return 0;
		}

		int left = calculateHeight(node.left) + 1;
		int right = calculateHeight(node.right) + 1;

		return Math.max(left, right);

	}

	static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}

	}
}
