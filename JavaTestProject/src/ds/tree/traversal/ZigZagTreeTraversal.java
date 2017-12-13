package ds.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTreeTraversal {

	public static void main(String[] args) {
		createTree();
	}

	private static void createTree() {
		Node root = new Node(50);
		insert(root, 25);
		insert(root, 75);
		insert(root, 12);
		insert(root, 30);
		insert(root, 60);
		insert(root, 85);

		insert(root, 6);
		insert(root, 15);
		insert(root, 26);
		insert(root, 40);
		insert(root, 55);
		insert(root, 65);
		insert(root, 80);
		insert(root, 90);

		printInOrder(root);
		System.out.println();
		System.out.println("zig zag level traversal");
		zigZaglevelTraversal(root);
	}

	private static void insert(Node node, int i) {

		if (i < node.value) {
			if (null == node.left) {
				node.left = new Node(i);
			} else {
				insert(node.left, i);
			}
		} else {
			if (null == node.right) {
				node.right = new Node(i);
			} else {
				insert(node.right, i);
			}
		}

	}

	private static void printInOrder(Node node) {

		if (null == node) {
			return;
		}

		printInOrder(node.left);
		System.out.print(node.value + " , ");
		printInOrder(node.right);
	}

	private static void zigZaglevelTraversal(Node root) {
		Queue queue = new LinkedList();
		Stack<Node> stack = new Stack();

		System.out.print(root.value + " , ");
		queue.add(root.left);
		queue.add(root.right);
		Node lnode = null;
		boolean leftOrdering = false;
		;
		while (!queue.isEmpty()) {

			while (!queue.isEmpty()) {
				stack.push((Node) queue.poll());
			}
			leftOrdering = !leftOrdering;

			while (!stack.isEmpty()) {
				lnode = stack.pop();
				System.out.print(lnode.value + " , ");
				if (leftOrdering) {
					if (null != lnode.right)
						queue.add(lnode.right);
					if (null != lnode.left)
						queue.add(lnode.left);
				} else {
					if (null != lnode.left)
						queue.add(lnode.left);
					if (null != lnode.right)
						queue.add(lnode.right);

				}
			}

		}

	}
}

class Node {

	Node left;
	Node right;
	int value;

	public Node(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}