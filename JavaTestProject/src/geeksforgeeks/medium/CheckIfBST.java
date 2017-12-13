package geeksforgeeks.medium;

public class CheckIfBST {
	private static Node root;

	public static void main(String[] args) {
		createBinaryTree();

		boolean checkIfBST = checkIfBST(root, Integer.MIN_VALUE,
				Integer.MAX_VALUE);
		System.out.println("checkIfBST =" + checkIfBST);
	}

	private static void createBinaryTree() {
		root = new Node(25);
		root.left = new Node(20);
		root.right = new Node(30);
	}

	private static boolean checkIfBST(Node node, int minVal, int maxVal) {

		if (null == node) {
			return true;
		}

		if (minVal < node.data && node.data < maxVal) {
			return checkIfBST(node.left, minVal, node.data)
					& checkIfBST(node.right, node.data, maxVal);
		}

		return false;
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