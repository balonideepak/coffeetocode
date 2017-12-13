package ds.linkedlist.singlelinklist;

public class RemoveDupsUnSortedList {

	/**
	 * @author deepak.baloni
	 * @param args
	 * 
	 * 
	 * <<<<<<<<<<<<  Not full proof program >>>>>>>>>>>>>>>>>>>>>
	 * 
	 */
	public static void main(String[] args) {
		Link link = new Link(10);
		link.next = new Link(20);
		link.next.next = new Link(10);
		link.next.next.next = new Link(30);
		link.next.next.next.next = new Link(30);
		link.next.next.next.next.next = new Link(30);
		link.next.next.next.next.next.next = new Link(50);
		link.next.next.next.next.next.next.next = new Link(60);

		Link current = link;
		Link innerCurrent = link;
		Link prevLink = null;
		Link prevLinkCurrent = null;

		int case1 = 0;
		int case2 = 0;
		int case3 = 0;

		while (current != null) {
			innerCurrent = link;
			int counter = 0;

			System.out.println("Inside outer loop " + current.data);
			while (innerCurrent != null) {

				if (current.data == innerCurrent.data && counter == 0) {
					case1++;
					++counter;
				} else if (current.data == innerCurrent.data && counter > 0) {
					case2++;
				} else {
					case3++;
				}

				innerCurrent = innerCurrent.next;

			}

			if (null == prevLink) {
				prevLink = new Link(current.data);
				prevLinkCurrent = new Link(current.data);
				prevLink.next = prevLinkCurrent;
			} else {

				if ((case1 == 1 || case3 == 1) && case2 == 0) {
					prevLinkCurrent.next = new Link(current.data);
					prevLinkCurrent = prevLinkCurrent.next;
				} else if (case2 > 0) {
					prevLinkCurrent.next = new Link(current.next.data);
				}
			}

			case1 = 0;
			case2 = 0;
			case3 = 0;
			current = current.next;
		}

		prevLink=prevLink.next;
		Link prevLinkTemp = prevLink;
		while (prevLinkTemp != null) {
			System.out.print(prevLinkTemp.data + " , ");
			prevLinkTemp = prevLinkTemp.next;
		}

	}

}
