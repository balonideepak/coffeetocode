package ds.linkedlist.singlelinklist.merge;


//https://github.com/officialdharam/techieme/blob/master/linkedlist/MergeLL.java
//http://techieme.in/merging-two-sorted-singly-linked-list/
public class MergeLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Integer> headNodeForFirstList = prepareLinkedList(new Integer[] {	1, 5, 6 , 10, 11 });
		printLinkedList(headNodeForFirstList);

		Node<Integer> headNodeForSecondList = prepareLinkedList(new Integer[] {2 ,7, 8 ,9 });
		printLinkedList(headNodeForSecondList);

		Node<Integer> mergedList = mergeLists(headNodeForFirstList, headNodeForSecondList);
		printLinkedList(mergedList);

	}

	private static Node<Integer> mergeLists(Node<Integer> list1Node ,Node<Integer> list2Node ) {
		System.out.println("Merging the lists ....");

		if (null == list1Node) {
			return list2Node;
		}
		if (null == list2Node) {
			return list1Node;
		}

		Node<Integer> head;

		if (list1Node.data < list2Node.data) {
			head = list1Node;
		} else {
			head = list2Node;
			list2Node = list1Node;
			list1Node = head;
		}

		while (list1Node.next != null && list2Node != null) {
			if (list1Node.next.data <= list2Node.data) {
				list1Node = list1Node.next;
			} else {
				Node<Integer> tmp = list1Node.next;
				list1Node.next = list2Node;
				list2Node = tmp;
			}
		}
		
		// Below if condition handles the scenario when the above while loop operation is completed and operation is performed only on list1Node 
		// and list2Node was never touched , so it need to be appended at the end to the list1Node
		if (list1Node.next == null)
			list1Node.next = list2Node;
		
		return head;
	}

	public static Node<Integer> prepareLinkedList(Integer... data) {
		Node<Integer> headNode = new Node<Integer>(data[0]);
		Node<Integer> previous = headNode;
		for (int i = 1; i < data.length; i++) {
			Node<Integer> node = new Node<Integer>(data[i]);
			previous.next = node;
			previous = node;
		}
		return headNode;
	}

	public static void printLinkedList(Node<Integer> head) {
		System.out.println("Printing LinkedList ...");
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

}
