package geeksforgeeks.medium;

public class DistanceBetweenTwoGivenNodes {

	private static int level = 0;

	public static void main(String[] args) {

		Node root = createTree();

		int result = findDistance(4, 6, root);
		System.out.println(result);

	}

	private static int findDistance(int i, int j, Node node) {

		int lResult = 0;
		getLevelFromRoot(node, i, 0);
		lResult += level;
		getLevelFromRoot(node, j, 0);
		lResult += level;
		return lResult;
	}

	private static void getLevelFromRoot(Node node, int key, int level) {

		if (null == node) {
			return;
		}

		if (node.data == key) {
			DistanceBetweenTwoGivenNodes.level = level;
		}

		getLevelFromRoot(node.left, key, level + 1);
		getLevelFromRoot(node.right, key, level + 1);

	}

	private static Node createTree() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);

		return root;
	}

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}
}
