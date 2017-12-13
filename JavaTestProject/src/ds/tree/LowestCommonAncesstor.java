package ds.tree;

public class LowestCommonAncesstor {
	public static void main(String[] args) {
		Node root = new Node(1);
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		findAncesstors(root, 4, "");
		findAncesstors(root, 6, "");
		findLCA(4, 5);

	}

	private static void findAncesstors(Node node, int i, String path) {

		if (node == null) {
			return;
		}

		if (i == node.data) {
			System.out.println(node.data+" "+path);
		}

		findAncesstors(node.left, i, node.data + " " + path);
		findAncesstors(node.right, i, node.data + " " + path);

	}

	private static void findLCA(int i, int j) {

	}

	static class Node {
		int data;
		Node left, right;

		Node(int value) {
			data = value;
			left = right = null;
		}
	}
}
