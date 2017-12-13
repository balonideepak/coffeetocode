package ds.linkedlist.doublylinklist;

public class DoublyLinkList {
	private Link first;
	private Link last;

	public boolean isEmpty() {
		return null == first;
	}

	public void insertFirst(int data) {
		Link newlink = new Link(data);

		if (isEmpty()) {
			last = newlink;
		} else {
			first.previous = newlink;
			newlink.next = first;
		}

		first = newlink;
	}

	public void insertLast(int data) {
		Link newlink = new Link(data);

		if (isEmpty()) {
			first = newlink;
		} else {
			last.next = newlink;
			newlink.previous = last;
		}
		last = newlink;
	}

	public void insertAfter(int key, int data) {

		Link current = first;

		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return;
			}
		}

		Link newlink = new Link(data);

		if (current == last) {
			newlink.next = null;
			last = newlink;
		} else {
			newlink.next = current.next;
			current.next.previous = newlink;
		}
		newlink.previous = current;
		current.next = newlink;

	}

	public void displayForward() {

		System.out.print("List (first --> last) :: ");
		Link current = (Link) first.clone();
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		System.out.print("List (last --> first) :: ");
		Link current = (Link) last.clone();
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println();

	}

	public void deleteFirst() {
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
			first = first.next;
		}
	}

	public void deleteLast() {
		if (last.previous == null) {
			first = null;
		} else {
			last.previous.next = null;
			last = last.previous;
		}
	}

	public void deleteKey(int key) {

		Link current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return;
			}
		}

		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}

		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}

	}

}
