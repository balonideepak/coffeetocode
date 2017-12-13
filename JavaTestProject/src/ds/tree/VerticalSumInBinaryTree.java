package ds.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VerticalSumInBinaryTree {
	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		Node root = new Node(1);
		root.setLeft(new Node(2));
		root.setRight(new Node(3));
		root.left().setLeft(new Node(4));
		root.left().setRight(new Node(5));
		root.right().setLeft(new Node(6));
		root.right().setRight(new Node(7));

		calculateSum(root, 0);

		printSum();

	}

	private static void calculateSum(Node node, int HD) {

		if (node == null) {
			return;
		}

		calculateSum(node.left, HD - 1);

		if (map.containsKey(HD)) {
			map.put(HD, map.get(HD) + node.key);
		} else {
			map.put(HD, node.key);
		}

		calculateSum(node.right, HD + 1);

	}

	private static void printSum() {
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getValue());
		}

	}

	static class Node {

		private int key;
		private Node left;
		private Node right;

		public int key() {
			return key;
		}

		public Node left() {
			return left;
		}

		public Node right() {
			return right;
		}

		public Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}
}
