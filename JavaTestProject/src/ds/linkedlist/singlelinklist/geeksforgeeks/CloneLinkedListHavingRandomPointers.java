package ds.linkedlist.singlelinklist.geeksforgeeks;

public class CloneLinkedListHavingRandomPointers {
	private static int[] arr = { 1, 2, 3, 4, 5 };
	private static Node root;

	public static void main(String[] args) {
		createList();
		printList();
		printListInPrevOrder();
		cloneList();
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

		// create previous pointers
		// 1-> 3, 2->1 ,3->5,4->3,5->2
		root.prev = root.next.next;
		root.next.prev = root;
		root.next.next.prev = root.next.next.next.next;
		root.next.next.next.prev = root.next.next;
		root.next.next.next.next.prev = root.next;

		System.out.println("List created.");
	}

	private static void printList() {
		System.out.println("Printing list with next ....");
		Node temp = root;
		do {
			System.out.println(temp.data);
		} while ((temp = temp.next) != null);
	}

	private static void printList(Node node) {
		System.out.println("Printing list with next ....");
		Node temp = node;
		do {
			System.out.println(temp.data);
		} while ((temp = temp.next) != null);
	}

	private static void printListInPrevOrder() {
		System.out.println("Printing list with prev ...");
		Node temp = root;
		do {
			System.out.println(temp.prev.data);
		} while ((temp = temp.next) != null);
	}

	private static void cloneList() {
		int counter = 0;
		Node temp = root;
		Node lTemp = null;
		do {
			if (counter % 2 == 0) {
				lTemp = temp.next;
				Node newNode = new Node(temp.data);
				newNode.next = lTemp;
				temp.next = newNode;
				newNode.prev = temp.prev;
			}
			counter++;
		} while ((temp = temp.next) != null);

		temp = root;
		Node orgNode = new Node(temp.data);
		orgNode.prev = new Node(temp.prev.data);
		Node orgList = orgNode;
		Node orgListTemp = orgList;
		while (temp != null) {

			while (orgListTemp.next != null) {
				orgListTemp = orgListTemp.next;
			}
			if (temp.next.next == null) {
				break;
			}
			orgListTemp.next = new Node(temp.next.next.data);
			temp = temp.next.next;
		}

		printList(orgList);

	}

}
