package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListToTreeConversion {
	// http://www.geeksforgeeks.org/given-linked-list-representation-of-complete-tree-convert-it-to-linked-representation/
	private static Queue<TreeNode> queue = new LinkedList<>();
	private static ListNode listRoot = null;
	private static TreeNode treeRoot = null;

	public static void main(String[] args) {
		listRoot = new ListNode(10);
		listRoot.next = new ListNode(12);
		listRoot.next.next = new ListNode(15);
		listRoot.next.next.next = new ListNode(25);
		listRoot.next.next.next.next = new ListNode(30);
		listRoot.next.next.next.next.next = new ListNode(36);

		ListNode temp = listRoot;
		treeRoot = new TreeNode(listRoot.data);
		TreeNode tempTreeNode = treeRoot;

		while (temp != null) {
			temp = temp.next;
			TreeNode firstTreeNode = new TreeNode(temp.data);
			queue.add(firstTreeNode);
			tempTreeNode.left = firstTreeNode;
			if (temp != null) {
				temp = temp.next;
				if (temp != null) {
					TreeNode secondTreeNode = new TreeNode(temp.data);
					queue.add(secondTreeNode);
					tempTreeNode.right = secondTreeNode;
				}
			}
			tempTreeNode = queue.poll();
		}

		printInOrder(treeRoot);

	}

	private static void printInOrder(TreeNode node) {
		if (node == null)
			return;

		printInOrder(node.left);
		System.out.print(node.data + " ");
		printInOrder(node.right);
	}

	static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "" + data;
		}
	}

	static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}

		@Override
		public String toString() {

			return "" + data;
		}

	}

}
