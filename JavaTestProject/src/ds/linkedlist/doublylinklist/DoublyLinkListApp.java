package ds.linkedlist.doublylinklist;

public class DoublyLinkListApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DoublyLinkList list = new DoublyLinkList();

		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);

		list.insertLast(40);
		list.insertLast(50);
		list.insertLast(60);

		list.displayForward();
		list.displayBackward();
		
		list.deleteFirst();
		list.deleteFirst();
		
		list.displayForward();
		
		list.deleteLast();
		list.deleteLast();
		
		list.displayForward();
		
		list.insertAfter(40, 70);
		list.displayForward();
		
		list.deleteKey(40);
		list.displayForward();

		list.deleteKey(70);
		list.displayForward();
		
	}

}
