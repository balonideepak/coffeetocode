package ds.linkedlist.singlelinklist.geeksforgeeks;

public class PairwiseSwap {

	private static int[] arr = { 1, 2, 3, 4, 5,6 };
	private static Node root;

	public static void main(String[] args) {
		createList();
		doPairWiseSwap();
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

	private static void doPairWiseSwap() {
		Node temp = root;
		while (temp != null) {
			String current_data=temp.data;
			
			if(null!=temp.next){
				String nextdata=temp.next.data;
				temp.data=nextdata;
				temp.next.data=current_data;
			}
			
			temp = temp.next;
			if(null!=temp){
				temp=temp.next;
			}
		}
	}

	private static void printList() {
		Node temp = root;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
