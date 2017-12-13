package geeksforgeeks.medium;

import java.util.Stack;

public class MergeTwoBST {
	public static void main(String[] args) {

		Node root1 = new Node(8);
		root1.left = new Node(2);
		root1.left.left = new Node(1);

		Node root2 = new Node(5);
		root2.left = new Node(3);
		root2.left.left = new Node(0);

		merge(root1, root2);

	}

	private static void merge(Node node1, Node node2) {

		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();

		if (node1 == null) {
			inorder(node2);
			return;
		}

		if (node2 == null) {
			inorder(node1);
			return;
		}

		while (node1 != null || node2 != null || !s1.isEmpty() || !s2.isEmpty()) {

			if (node1 != null || node2 != null) {

				if (node1 != null) {
					s1.push(node1);
					node1 = node1.left;
				}

				if (node2 != null) {
					s2.push(node2);
					node2 = node2.left;
				}
			} else {

				if (s1.isEmpty()) {
					while (!s2.isEmpty()) {
						Node node = s2.pop();
						node.left = null;
						inorder(node);
						return;
					}
				}

				if (s2.isEmpty()) {
					while (!s1.isEmpty()) {
						Node node = s1.pop();
						node.left = null;
						inorder(node);
						return;
					}
				}

				Node current1 = s1.peek();
				Node current2 = s2.peek();

				if (current1.data < current2.data) {
					System.out.print(current1.data + " ");
					s1.pop();
				} else if (current2.data < current1.data) {
					System.out.print(current2.data + " ");
					s2.pop();
				}

			}

		}

	}

	private static void inorder(Node node) {

		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}

	}
}
