package ds.linkedlist.singlelinklist.geeksforgeeks;

public class RemoveDuplicateFromSortedList {

	private static int[] arr = { 1, 1, 1, 1, 2, 2, 3, 4, 5 };
	private static Node root;

	public static void main(String[] args) {
		createList();
		removeDups();
		printList();
	}

	private static void createList() {
		root = new Node("" + arr[0]);
		Node temp = root;
		for (int i = 1; i < arr.length; i++) {

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node("" + arr[i]);
		}
	}

	private static void removeDups() {
		Node temp = root;
		while (temp != null) {
			if (temp.next != null && temp.data.equals(temp.next.data)) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
	}

	private static void printList() {
		Node temp = root;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
