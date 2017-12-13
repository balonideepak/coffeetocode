package ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUtil {

	private static Queue queue = new LinkedList();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printOptions();
		int option = in.nextInt();
		switch (option) {
		case 1:
			checkIdenticalTrees();
			break;
		case 2:
			levelOrderTraversal();
			break;
		case 3:
			System.exit(0);
		default:
			break;
		}
	}

	private static void checkIdenticalTrees() {
		_TreeNode firstTreeRootNode = new _TreeNode(10);
		insert(firstTreeRootNode, 5);
		insert(firstTreeRootNode, 11);
		insert(firstTreeRootNode, 2);
		insert(firstTreeRootNode, 1);
		insert(firstTreeRootNode, 25);

		_TreeNode secondTreeRootNode = new _TreeNode(10);
		insert(secondTreeRootNode, 5);
		insert(secondTreeRootNode, 11);
		insert(secondTreeRootNode, 2);
		insert(secondTreeRootNode, 1);
		insert(secondTreeRootNode, 22);

		// printInOrder(firstTreeRootNode);

		boolean checkIfIdentical = checkIfIdentical(firstTreeRootNode,
				secondTreeRootNode);
		System.out.println(checkIfIdentical);
	}

	private static void insert(_TreeNode node, int data) {
		if (data < node.data) {
			if (node.left == null) {
				node.left = new _TreeNode(data);
			} else {
				insert(node.left, data);
			}
		} else if (data > node.data) {
			if (node.right == null) {
				node.right = new _TreeNode(data);
			} else {
				insert(node.right, data);
			}
		}
	}

	private static void printInOrder(_TreeNode node) {
		if (null == node) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.data + " , ");
		printInOrder(node.right);
	}

	private static boolean checkIfIdentical(_TreeNode firstTreeNode,
			_TreeNode secondTreeNode) {
		if (null == firstTreeNode && null == secondTreeNode) {
			return true;
		} else if (null == firstTreeNode || null == secondTreeNode) {
			return false;
		} else {
			return ((firstTreeNode.data == secondTreeNode.data)
					&& (checkIfIdentical(firstTreeNode.left,
							secondTreeNode.left)) && (checkIfIdentical(
						firstTreeNode.right, secondTreeNode.right)));
		}
	}

	private static void levelOrderTraversal() {
		_TreeNode root = new _TreeNode(10);
		insert(root, 5);
		insert(root, 11);
		insert(root, 2);
		insert(root, 1);
		insert(root, 25);

		if (null != root) {
			System.out.print(root.data+" ");
			queue.add(root.left);
			queue.add(root.right);
		}
		_levelOrderTraversal();

	}

	private static void _levelOrderTraversal() {
		while (!queue.isEmpty()) {
			_TreeNode lNode = (_TreeNode) queue.poll();
			if (null != lNode) {
				System.out.print(lNode.data+" ");
				queue.add(lNode.left);
				queue.add(lNode.right);
			}
		}

	}

	private static void printOptions() {
		System.out.println("Please press 1 to check if trees are identical");
		System.out
				.println("Please press 2 to check print level order traversal ");
		System.out.println("Please press 3 to exit ");
	}

}

class _TreeNode {
	int data;
	_TreeNode left;
	_TreeNode right;

	public _TreeNode(int data) {
		this.data = data;
	}

}
