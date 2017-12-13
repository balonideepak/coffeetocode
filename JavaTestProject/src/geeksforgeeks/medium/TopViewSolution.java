package geeksforgeeks.medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class TopViewSolution {
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.left.right.right = new Node(5);
		root.left.right.right.right = new Node(6);

		printTopView(root);

	}

	private static void printTopView(Node root) {

		Node node = root;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		Set<Integer> set = new TreeSet<Integer>();
		while (!queue.isEmpty()) {
			node = queue.remove();

			int HD = node.HD;
			if (!set.contains(HD)) {
				set.add(HD);
				System.out.print(node.data + " ");
			}

			if (node.left != null) {
				Node left = node.left;
				left.HD = HD - 1;
				queue.add(left);
			}

			if (node.right != null) {
				Node right = node.right;
				right.HD = HD + 1;
				queue.add(right);
			}

		}

	}

	static class Node {
		int data;
		int HD;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

}
