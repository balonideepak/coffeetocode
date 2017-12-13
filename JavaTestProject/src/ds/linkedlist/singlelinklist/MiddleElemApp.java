package ds.linkedlist.singlelinklist;

public class MiddleElemApp {
	public static void main(String[] args) {

		Link link = new Link(10);
		link.next = new Link(20);
		link.next.next = new Link(30);
		link.next.next.next = new Link(40);
		link.next.next.next.next = new Link(50);
		link.next.next.next.next.next = new Link(60);

		Link current = link;
		int counter=0;
		Link slowNode=link;
		System.out.print("List data >>> ");
		while (current != null) {
			System.out.print(current.data+" , ");
			counter++;
			if(counter%2==0){
				slowNode=slowNode.next;
			}
			current = current.next;
		}
		System.out.println("");
		
		System.out.println("Middle element data :: >>>> "+slowNode.data);
	}
}
