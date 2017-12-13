package ds.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	private static TreeNode root = null;
	private static int arr[] = { 30, 70, 20, 40, 60, 80 };
	private static Queue<TreeNode> queue = new LinkedList<TreeNode>();

	public static void main(String[] args) {
		root = new TreeNode(50);
		for (int i = 0; i < arr.length; i++) {
			createTree(root, arr[i]);
		}

		queue.add(root);
		levelOrderTraversal(root);
	}

	private static void createTree(TreeNode node, int val) {

		if (null == node) {
			return;
		}

		if (val < node.val) {

			if (null == node.left) {
				node.left = new TreeNode(val);
			}

			createTree(node.left, val);

		} else if (val > node.val) {

			if (null == node.right) {
				node.right = new TreeNode(val);
			}

			createTree(node.right, val);
		}

	}

	private static void levelOrderTraversal(TreeNode node) {
		System.out.println("Level order traversal");
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			if (null != poll) {
				System.out.print(poll.val + " ");
				queue.add(poll.left);
				queue.add(poll.right);
			}

		}

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}
}
