package ds.tree.traversal;

public class InOrderTreeTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node(5);
		insert(root, 1);
		insert(root, 8);
		insert(root, 6);
		insert(root, 3);
		insert(root, 9);

		printInOrder(root);

	}

	private static void insert(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				node.left = new Node(value);
			}
		} else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				node.right = new Node(value);
			}
		}
	}

	private static void printInOrder(Node node) {

		if (node != null) {

			printInOrder(node.left);
			System.out.println(node.value);
			printInOrder(node.right);

		}

	}

	private static class Node {

		Node left;
		Node right;
		int value;

		public Node(int value) {
			this.value = value;
		}

	}

}
