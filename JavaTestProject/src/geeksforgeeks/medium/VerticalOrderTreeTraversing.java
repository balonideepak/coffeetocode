package geeksforgeeks.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VerticalOrderTreeTraversing {

	public static void main(String[] args) {

		Node root = createTree();
		Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		traverseInVerticalOrder(root, 0, map);
		printVerticalOrder(map);
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
		root.right.right.right = new Node(9);
		root.right.right.left = new Node(10);
		root.right.right.left.right = new Node(11);
		root.right.right.left.right.right = new Node(12);
		return root;
	}

	private static void traverseInVerticalOrder(Node node, int HD,
			Map<Integer, List<Integer>> map) {

		if (node == null) {
			return;
		}

		if (map.containsKey(HD)) {
			map.get(HD).add(node.data);
		} else {
			List<Integer> list = new LinkedList<Integer>();
			list.add(node.data);
			map.put(HD, list);

		}

		traverseInVerticalOrder(node.left, HD - 1, map);
		traverseInVerticalOrder(node.right, HD + 1, map);

	}

	private static void printVerticalOrder(Map<Integer, List<Integer>> map) {

		Set<Map.Entry<Integer, List<Integer>>> entrySet = map.entrySet();
		for (Map.Entry<Integer, List<Integer>> entry : entrySet) {
			List<Integer> value = entry.getValue();
			//Collections.sort(value);
			System.out.println(value);
		}

	}

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

	}

}
