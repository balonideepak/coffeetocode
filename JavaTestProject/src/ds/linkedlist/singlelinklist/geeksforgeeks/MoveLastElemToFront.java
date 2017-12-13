package ds.linkedlist.singlelinklist.geeksforgeeks;

public class MoveLastElemToFront {

	private static int[] arr = { 1, 2, 3, 4, 5 };
	private static Node root;

	public static void main(String[] args) {
		createList();
		moveLastElemToFront();
		printList();
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
	}

	private static void moveLastElemToFront() {
		Node temp = root;
		Node prev_node=null;
		while (temp != null) {
			if(null!=temp.next && null==temp.next.next){
				prev_node=temp;
			}
			temp = temp.next;
		}
		Node lastNode=prev_node.next;
		prev_node.next=null;
		lastNode.next=root;
		root=lastNode;
	}

	private static void printList() {
		Node temp = root;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
