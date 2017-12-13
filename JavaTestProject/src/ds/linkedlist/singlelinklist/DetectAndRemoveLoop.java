package ds.linkedlist.singlelinklist;

import ds.linkedlist.singlelinklist.LinkedList.Node;

public class DetectAndRemoveLoop {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new LinkedList.Node(50);
		list.head.next = new LinkedList.Node(20);
		list.head.next.next = new LinkedList.Node(15);
		list.head.next.next.next = new LinkedList.Node(4);
		list.head.next.next.next.next = new LinkedList.Node(10);

		list.head.next.next.next.next.next = list.head.next.next;
		detectAndRemoveLoop(list.head);
	}

	public static void detectAndRemoveLoop(Node node) {
		Node slow = node;
		Node fast = node;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				System.out.println("Loop detected..." + slow.data);
				return;
			}
		}

	}
}

class LinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;

		}

	}

}