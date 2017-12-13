package ds.linkedlist.singlelinklist.geeksforgeeks;

public class Intersection {

	private static Node firstListRootNode;
	private static Node secondListRootNode;

	public static void main(String[] args) {
		runTestCase1();
		runTestCase2();
	}

	private static Node createList(int[] arr) {
		Node rootnode = new Node("" + arr[0]);
		Node temp = rootnode;
		for (int i = 1; i < arr.length; i++) {
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new Node("" + arr[i]);
		}
		return rootnode;
	}

	private static void printList(Node node) {
		System.out.println("Printing list...");
		Node temp = node;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != null);
	}

	private static void checkForIntersection() {
		Node firstListTempNode = firstListRootNode;
		Node secondListTempNode = secondListRootNode;
		
		int firstListLength=0;
		int secondListLength=0;
		
		while (firstListTempNode.next != null) {
			firstListTempNode = firstListTempNode.next;
			firstListLength++;
		}
		
		while (secondListTempNode.next != null) {
			secondListTempNode = secondListTempNode.next;
			secondListLength++;
		}
		
		
		while (firstListTempNode.next != null) {
			if (firstListTempNode.data.equals(secondListTempNode.data)) {
				System.out.println("Intersection point found");
				break;
			}
			firstListTempNode = firstListTempNode.next;
			secondListTempNode = secondListTempNode.next;
		}
	}

	private static void runTestCase1() {
		int[] firstListInputArr = { 1, 2, 4, 3, 5, 6, 7, 8 };
		int[] secondListInputArr = { 11, 12, 13, 3, 88, 99, 78, 90 };
		firstListRootNode = createList(firstListInputArr);
		printList(firstListRootNode);
		secondListRootNode = createList(secondListInputArr);
		printList(secondListRootNode);
		checkForIntersection();
	}

	private static void runTestCase2() {
		int[] firstListInputArr = { 1, 2, 4, 3, 5, 6, 7, 8 };
		int[] secondListInputArr = {13, 3, 88, 99, 78, 90 };
		firstListRootNode = createList(firstListInputArr);
		printList(firstListRootNode);
		secondListRootNode = createList(secondListInputArr);
		printList(secondListRootNode);
		checkForIntersection();

	}

}
