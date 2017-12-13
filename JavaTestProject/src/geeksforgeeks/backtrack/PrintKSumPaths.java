package geeksforgeeks.backtrack;

import java.util.LinkedList;
import java.util.List;

//http://www.geeksforgeeks.org/print-k-sum-paths-binary-tree/
public class PrintKSumPaths {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(-1);
		root.left.left = new Node(2);
		root.left.right = new Node(1);
		root.left.right.right = new Node(1);

		int target = 5;

		List<Integer> path = new LinkedList<Integer>();

		printKSumPaths(root, path, target);
	}

	private static void printKSumPaths(Node node, List<Integer> path, int target) {
		if (node == null) {
			return;
		}

		path.add(node.data);
		printKSumPaths(node.left, path, target);
		printKSumPaths(node.right, path, target);

		int localSum = 0;

		for (int i = path.size() - 1; i >= 0; i--) {
			localSum += path.get(i);
			if (localSum == target) {
				print(path, i);
			}
		}

		path.remove(path.size() - 1);
	}

	private static void print(List<Integer> path, int i) {
		for (int j = i; j < path.size(); j++) {
			System.out.print(path.get(j) + " ");
		}
		System.out.println();

	}

	static class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

}
