package geeksforgeeks.medium;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BottomViewTreeApp {

	// This question is done by InOrder please use the level order traversal
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);

		Map<Integer, Node> map = new TreeMap<Integer, Node>();
		printBottomView(root, map, 0);

		printMap(map);

	}

	private static void printBottomView(Node node, Map<Integer, Node> map,
			int HD) {

		if (node == null) {
			return;
		}

		printBottomView(node.left, map, HD - 1);
		if (!map.containsKey(HD))
			map.put(HD, node);
		printBottomView(node.right, map, HD + 1);

	}

	private static void printMap(Map<Integer, Node> map) {
		if (map.size() != 0) {
			Set<Map.Entry<Integer, Node>> entrySet = map.entrySet();
			for (Map.Entry<Integer, Node> entry : entrySet) {

				System.out.print(entry.getValue().data + " ");

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
