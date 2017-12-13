package ds.tree;

public class CreateMirrorTree {
	public static void main(String[] args) {

		Node root = new Node(5);
		root.left = new Node(6);
		root.right = new Node(9);
		root.left.left = new Node(7);
		root.left.right = new Node(8);
		root.right.right = new Node(10);

		Node mirrorTreeRoot = createMirrorTree(root);
		printInorder(mirrorTreeRoot);

	}

	private static Node createMirrorTree(Node node) {
		if (node == null) {
			return null;
		}

		Node left = node.left;
		Node right = node.right;
		node.left = right;
		node.right = left;

		createMirrorTree(node.left);
		createMirrorTree(node.right);

		return node;
	}

	private static void printInorder(Node node) {

		if (node == null) {
			return;
		}
		printInorder(node.left);
		System.out.println(node.val);
		printInorder(node.right);

	}

	static class Node {

		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return "Node [val=" + val + "]";
		}

	}
}
