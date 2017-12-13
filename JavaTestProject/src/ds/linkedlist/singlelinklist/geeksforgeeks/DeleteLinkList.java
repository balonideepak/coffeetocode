package ds.linkedlist.singlelinklist.geeksforgeeks;

public class DeleteLinkList {
	private static Node tail;
	private static int arr[] = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {
		System.out.println("Creating list");
		System.out.println("************");
		for (int i : arr) {
			createList(i);
		}

		System.out.println();
		System.out.println("Printing list from last");
		System.out.println("********************");
		displayListFromLast();

		System.out.println();
		System.out.println("Deleting list");
		System.out.println("************");
//		deleteList();

		System.out.println();
		System.out.println("Printing list from last");
		System.out.println("********************");
		displayListFromLast();
	}

	private static void createList(int i) {
		Node node = new Node(i + "");
		node.next = tail;
		tail = node;
	}

	private static void deleteList() {
		while (tail != null) {
			System.out.println("Deleting " + tail.data);
			tail = tail.next;
		}
	}

	private static void displayListFromLast() {
		Node tempNode = tail;
		while (tempNode != null) {
			System.out.println("Printing : " + tempNode.data);
			tempNode = tempNode.next;
		}
	}
	
	

}
