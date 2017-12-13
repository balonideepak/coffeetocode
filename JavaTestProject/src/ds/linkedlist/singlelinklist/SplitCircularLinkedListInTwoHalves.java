package ds.linkedlist.singlelinklist;

public class SplitCircularLinkedListInTwoHalves {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Link link = new Link(10);
		link.next = new Link(20);
		link.next.next = new Link(30);
		link.next.next.next = new Link(40);
		link.next.next.next.next = new Link(50);
		link.next.next.next.next.next = new Link(60);
		link.next.next.next.next.next.next = new Link(70);
		link.next.next.next.next.next.next.next = link;

		Link fastNode = link;
		Link slowNode = link;
		while (fastNode.next != link && fastNode.next.next != link) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}

		Link head_2 = slowNode.next;
		slowNode.next = link;
		fastNode.next = head_2;

		System.out.println("Printing first half......");
		printList(link);
		System.out.println();
		System.out.println("Printing second half......");
		printList(head_2);

	}

	private static void printList(Link link) {
		Link temp = link;
		if (temp != null) {
			do {
				System.out.print(temp.data+" , ");
				temp=temp.next;
			} while (temp != link);
		}
	}
}
