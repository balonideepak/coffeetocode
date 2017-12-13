package geeksforgeeks.medium;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectLevelNodes {
	private static Node root = null;

	public static void main(String[] args) {
		ConnectLevelNodes OBJ = new ConnectLevelNodes();
		root = OBJ.new Node(1);
		root.left = OBJ.new Node(2);
		root.right = OBJ.new Node(3);
		root.left.left = OBJ.new Node(4);
		root.left.right = OBJ.new Node(5);
		root.right.left = OBJ.new Node(6);
		root.right.right = OBJ.new Node(7);

		connectNodesAtSameLevel();

		printInOrder(root);
	}

	private static void connectNodesAtSameLevel() {

		Queue<Node> queue = new LinkedList<Node>();
		int nodesSize = 0;

		Node node = root;
		queue.add(node);

		while (!queue.isEmpty()) {
			nodesSize = queue.size();
			Node prev = null;
			node = null; 
			while (nodesSize > 0) {

				node = queue.poll();
				if (null == prev) {
					prev = node;
				} else {
					prev.nextRight = node;
					prev = node;
				}

				if (null != node.left) {
					queue.add(node.left);
				}

				if (null != node.right) {
					queue.add(node.right);
				}

				nodesSize--;
			}

		}
	}

	private static void printInOrder(Node node) {

		if (node == null) {
			return;
		}

		printInOrder(node.left);
		System.out.println(node.nextRight);
		printInOrder(node.right);

	}

	class Node {
		int data;
		Node left;
		Node right;
		Node nextRight;

		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "" + data;
		}

	}

}