package geeksforgeeks.medium;

public class FindInOrderSuccessor {
	public static void main(String[] args) {
		FindInOrderSuccessor tree = new FindInOrderSuccessor();
		Node root = null, temp = null, suc = null, min = null;
		root = tree.insert(root, 20);
		root = tree.insert(root, 8);
		root = tree.insert(root, 22);
		root = tree.insert(root, 4);
		root = tree.insert(root, 12);
		root = tree.insert(root, 10);
		root = tree.insert(root, 14);
		temp = root.left;

		Node result = inOrderSuccessor(root, temp);
		System.out.println(result.data);

	}

	private static Node inOrderSuccessor(Node root, Node node) {

		Node succ = null;

		if (root.right != null) {
			return minVal(root.right);
		}

		while (root != null) {
			if (node.data < root.data) {
				succ = root;
				node = root.left;
			} else if (node.data > root.data) {
				node = root.right;
			} else {
				break;
			}
		}

		return succ;

	}

	private static Node minVal(Node node) {

		while (node.left != null) {
			node = node.left;
		}
		return node;

	}

	Node insert(Node node, int data) {

		/*
		 * 1. If the tree is empty, return a new, single node
		 */
		if (node == null) {
			return (new Node(data));
		} else {

			Node temp = null;

			/* 2. Otherwise, recur down the tree */
			if (data <= node.data) {
				temp = insert(node.left, data);
				node.left = temp;
				temp.parent = node;

			} else {
				temp = insert(node.right, data);
				node.right = temp;
				temp.parent = node;
			}

			/* return the (unchanged) node pointer */
			return node;
		}
	}

	class Node {

		int data;
		Node left, right, parent;

		Node(int d) {
			data = d;
			left = right = parent = null;
		}
	}

}
