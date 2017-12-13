package ds.linkedlist.singlelinklist;

public class ReverseLinkedList {
	public static void main(String[] args) {
		Link link = new Link(10);
		link.next = new Link(20);
		link.next.next = new Link(30);
		link.next.next.next = new Link(40);

		Link current = link;
		System.out.println("Forward view ");
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}

		System.out.println("\nReverse view ");
		Link reverse = reverse(link);
		while (reverse != null) {
			System.out.print(reverse.data + "-->");
			reverse = reverse.next;
		}
	}

	private static Link reverse(Link link) {

		if (null == link || link.next == null) {
			return link;
		}

		Link remainingReverse = reverse(link.next);

		Link current = remainingReverse;

		while (current.next != null) {
			current = current.next;
		}

		current.next = link;
		link.next = null;

		return remainingReverse;
	}

}
