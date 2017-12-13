package geeksforgeeks.easy;

public class PrintAllRootToLeafPaths {
	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(8);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right = new Node(2);
		root.right.left = new Node(2);

		pritnAllPaths(root);

	}

	private static void pritnAllPaths(Node node) {
		printPath(node, "");
	}

	private static void printPath(Node node, String path) {

		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			System.out.println(path + " " + node.val);
			return;
		}

		printPath(node.left, path + node.val + " ");

		printPath(node.right, path + node.val + " ");

	}

	static class Node {
		private int val;
		private Node left;
		private Node right;

		public Node(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return "Node [val=" + val + "]";
		}

	}

}
