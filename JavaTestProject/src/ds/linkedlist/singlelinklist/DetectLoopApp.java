package ds.linkedlist.singlelinklist;

public class DetectLoopApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Link link = new Link(10);
		link.next = new Link(20);
		Link link2 = link.next;
		link2.next = new Link(30);
		link2.next.next = new Link(40);
		link2.next.next.next = new Link(50);
		link2.next.next.next.next = link2;
		//link2.next.next.next.next = new Link(60);  // uncomment , to see no loop and comment above line

		Link fastNode = link;
		Link slowNode = link;
		int counter=0;
		while (slowNode != null) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
			if(fastNode==null){
				System.out.println("No Loop ");
				break;
			}
			if (slowNode.data == fastNode.data && counter!=0) {
				System.out.println("Found loop at >>>>> "+slowNode.data);
				break;
			}
			counter++;
		}

	}

}
