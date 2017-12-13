package ds.linkedlist.singlelinklist.delete;

public class LinkedList<T> {

	private Node<T> first;

	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = first;
		first = newNode;
	}

	public Node<T> deleteFirst() {
		if (first == null) {
			throw new RuntimeException("List is empty ..");
		}
		Node<T> tempNode = first;
		first = first.next;
		return tempNode;
	}

	public void displyLinkedList() {

		Node<T> tempNode = first;
		while (tempNode != null) {
        tempNode.displayNode();
        tempNode=tempNode.next;
		}

	}

}
