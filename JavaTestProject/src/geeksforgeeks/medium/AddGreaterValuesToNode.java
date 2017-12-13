package geeksforgeeks.medium;

public class AddGreaterValuesToNode {
	private static Node root;

	public static void main(String[] args) {
		createBinaryTree();

		addGreaterValuesToNode();

		printInOrder(root);
	}

	private static void modifyBST(Node node, Sum S) {

		if (node == null) {
			return;
		}

		modifyBST(node.right, S);

		S.sum = S.sum + node.data;
		node.data = S.sum;

		modifyBST(node.left, S);

	}

	private static void addGreaterValuesToNode() {
		modifyBST(root, new Sum());
	}

	private static void printInOrder(Node node) {

		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.data+" ");
		printInOrder(node.right);

	}

	private static void createBinaryTree() {
		root = new Node(25);
		root.left = new Node(20);
		root.right = new Node(30);
	}
}

class Node {
	int data;
	Node right;
	Node left;

	public Node(int data) {
		this.data = data;
	}

}

class Sum {
	int sum = 0;
}