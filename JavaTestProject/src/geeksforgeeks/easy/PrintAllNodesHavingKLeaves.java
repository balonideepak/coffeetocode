package geeksforgeeks.easy;

//http://www.geeksforgeeks.org/print-nodes-binary-tree-k-leaves/

public class PrintAllNodesHavingKLeaves {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		findNodesWithKLeaves(root);

	}

	private static int findNodesWithKLeaves(Node node) {
		if (node == null) {
			return 0;
		}

		int left = findNodesWithKLeaves(node.left);
		int right = findNodesWithKLeaves(node.right);

		int nodes = left + right;

		if (nodes == 2) {
			System.out.println(node.val);
		}

		return nodes + 1;

	}

	static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			super();
			this.val = val;
		}

		@Override
		public String toString() {
			return "Node [val=" + val + "]";
		}

	}

}
