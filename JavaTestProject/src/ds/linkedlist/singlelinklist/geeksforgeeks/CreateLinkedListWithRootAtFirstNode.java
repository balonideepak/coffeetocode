package ds.linkedlist.singlelinklist.geeksforgeeks;

public class CreateLinkedListWithRootAtFirstNode {
	private static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
	private static Node root;

	public static void main(String[] args) {
		createList();
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

	private static void printList() {
		Node temp = root;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != null);
	}

}
