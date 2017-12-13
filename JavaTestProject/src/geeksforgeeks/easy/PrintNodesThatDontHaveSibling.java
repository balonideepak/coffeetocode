package geeksforgeeks.easy;

public class PrintNodesThatDontHaveSibling {
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.left.left = new Node(6);

		printNodes(root);
	}

	private static void printNodes(Node node) {

		if (node == null) {
			return;
		}

		if (node.left == null & node.right != null) {
			System.out.println(node.right.val);
			printNodes(node.right);
		} else if (node.left != null & node.right == null) {
			System.out.println(node.left.val);
			printNodes(node.left);
		} else {
			printNodes(node.left);
			printNodes(node.right);
		}

	}

	static class Node {
		int val;
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
