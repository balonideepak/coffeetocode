package ds.heap;

import java.util.ArrayList;

//http://www.geeksforgeeks.org/convert-bst-min-heap/

/*
 * Condition >>>>>>>>>>>>>>>>
 * ------------------------------------------------------------------------------------------
 * 
 * All the nodes in the Min Heap satisfies the given
 condition, that is, values in the left subtree of
 a node should be less than the values in the right
 subtree of the node. 
 */

public class ConvertBSTtoMinHeap {

	public static void main(String[] args) {

		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		int arr[] = new int[7];
		populateArr(root, arr);

		Array.index = 0;

		System.out.println("Printing BST");
		printArray(arr);

		prepareMinHeap(root, arr);
		System.out.println("Printing min heap");
		printHeap(root);

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		int removeDuplicates = removeDuplicates(a);
		System.out.println(removeDuplicates);

	}

	private static void printHeap(Node root) {

		Node temp = root;

		_printHeap(temp);

	}

	private static void _printHeap(Node node) {

		if (node == null) {
			return;
		}

		_printHeap(node.left);
		System.out.print(node.val + " ");

		_printHeap(node.right);

	}

	private static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	private static void populateArr(Node node, int[] arr) {
		if (node == null) {
			return;
		}
		populateArr(node.left, arr);
		arr[Array.index++] = node.val;
		populateArr(node.right, arr);

	}

	private static void prepareMinHeap(Node node, int[] arr) {
		if (node == null) {
			return;
		}

		node.val = arr[Array.index++];

		prepareMinHeap(node.left, arr);

		prepareMinHeap(node.right, arr);

	}

	static class Node {
		Node left;
		Node right;
		int val;

		public Node(int val) {
			this.val = val;
		}

	}

	static class Array {
		static int index;
	}

	public static int removeDuplicates(ArrayList<Integer> a) {

		if (a.size() == 0) {
			return 0;
		}

		int index = 1;
		for (int i = 1; i < a.size(); i++) {
			if (!a.get(i).equals(a.get(i - 1))) {

				a.set(index, a.get(i));
				index++;
			}
		}

		System.out.println(a);
		
		return index;
	}

}
