package ds.linkedlist.singlelinklist.delete;


//http://www.javamadesoeasy.com/2015/01/single-linkedlist-genericinsertdelete.html
public class InsertDeleteLinkedList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<Integer> oLinkedList=new LinkedList<Integer>();
		oLinkedList.insertFirst(10);
		oLinkedList.insertFirst(20);
		oLinkedList.insertFirst(30);
		oLinkedList.insertFirst(40);
		oLinkedList.insertFirst(50);
		
		System.out.println(" ********  Display Nodes **********");
		oLinkedList.displyLinkedList();
		
		System.out.println("***** Delete operation *************");
		Node<Integer> deletedNode = oLinkedList.deleteFirst();
		deletedNode.displayNode();
		
		System.out.println("***** Delete operation *************");
		deletedNode = oLinkedList.deleteFirst();
		deletedNode.displayNode();
		
		System.out.println(" ********  Display Nodes **********");
		oLinkedList.displyLinkedList();
		
	}
	
}



