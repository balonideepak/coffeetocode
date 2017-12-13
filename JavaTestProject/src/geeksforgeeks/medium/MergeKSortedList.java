package geeksforgeeks.medium;

public class MergeKSortedList {
	public static void main(String[] args) {

		Node[] arr = new Node[4];

		Node root1 = new Node(1);
		root1.next = new Node(3);
		root1.next.next = new Node(5);
		root1.next.next.next = new Node(7);

		Node root2 = new Node(2);
		root2.next = new Node(4);
		root2.next.next = new Node(6);
		root2.next.next.next = new Node(8);

		Node root3 = new Node(9);
		root3.next = new Node(11);

		Node root4 = new Node(10);
		root4.next = new Node(12);

		arr[0] = root1;
		arr[1] = root2;
		arr[2] = root3;
		arr[3] = root4;

		Node result = mergeKSortedLists(arr, arr.length-1);
		Node temp = result;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	private static Node mergeKSortedLists(Node[] arr, int last) {
		int j = last;
		while (last != 0) {
			int i = 0;
			while (i < j) {
				arr[i] = merge(arr[i], arr[j]);
				i++;
				j--;
				if (i >= j) {
					last = j;
				}
			}
		}

		return arr[0];
	}

	private static Node merge(Node node1, Node node2) {

		Node result = null;

		if (node1 == null) {
			return node2;
		}

		if (node2 == null) {
			return node1;
		}

		if (node1.data < node2.data) {
			result = node1;
			result.next = merge(node1.next, node2);
		} else if (node2.data < node1.data) {
			result = node2;
			result.next = merge(node1, node2.next);
		}

		return result;
	}

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

}
