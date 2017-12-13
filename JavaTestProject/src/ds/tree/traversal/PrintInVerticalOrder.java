package ds.tree.traversal;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintInVerticalOrder {
	private static TreeNode root = null;
	private static int arr[] = { 30, 70, 20, 40, 60, 80 };
	private static Map<Integer, String> map = new TreeMap<Integer, String>();

	public static void main(String[] args) {
		root = new TreeNode(50);
		for (int i = 0; i < arr.length; i++) {
			createTree(root, arr[i]);
		}

		calculateDistance(root, 0);

		printInVerticalOrder();
	}

	private static void createTree(TreeNode node, int val) {
		if (null == node) {
			return;
		}

		if (val < node.val) {
			if (null == node.left) {
				node.left = new TreeNode(val);
			} else {
				createTree(node.left, val);
			}
		} else if (val > node.val) {
			if (null == node.right) {
				node.right = new TreeNode(val);
			} else {
				createTree(node.right, val);
			}
		}
	}

	private static void calculateDistance(TreeNode node, int HD) {

		if (node == null) {
			return;
		}

		calculateDistance(node.left, HD - 1);

		if (map.containsKey(HD)) {
			map.put(HD, map.get(HD) + " " + node.val);
		} else {
			map.put(HD, "" + node.val);
		}

		calculateDistance(node.right, HD + 1);
	}

	private static void printInVerticalOrder() {
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getValue());
		}
	}

}
