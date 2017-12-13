package ds.linkedlist.singlelinklist.geeksforgeeks;

import ds.linkedlist.Node;

public class MiddleOfLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
	    node.next.next.next.next = new Node(5);
	    node.next.next.next.next.next = new Node(6);
	    node.next.next.next.next.next.next = new Node(7);
	    node.next.next.next.next.next.next.next = new Node(8);
	    node.next.next.next.next.next.next.next.next = new Node(9);

		findMiddleNode(node);

	}

	private static void findMiddleNode(Node node) {

		Node fastPointer = node;
		Node slowPointer = node;

		while (fastPointer != null) {

			Node tempFastPointer = fastPointer.next;
			if (null != tempFastPointer) {
				if (tempFastPointer.next == null) {
					fastPointer = null;
					break;
				} else {
					fastPointer = tempFastPointer.next;
				}
			} else {
				fastPointer = null;
				break;
			}

			slowPointer = slowPointer.next;
		}

		System.out.println(slowPointer.data);

	}

}
