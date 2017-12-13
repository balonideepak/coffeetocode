package ds.linkedlist.singlelinklist.geeksforgeeks;

public class LoopDetection {
	static int[] arr = { 1, 2, 3, 4, 5 };
	static Node tail;

	public static void main(String[] args) {
		createList();
		detectLoop();
	}

	private static void createList() {
		for (int i : arr) {
			Node node = new Node(i + "");
			node.next = tail;
			tail = node;
		}

		/* create loop */
		int counter=0;
		Node temp = tail;
		while (temp.next != null) {
			temp = temp.next;
			counter=counter+1;
			boolean b = (counter==2);
			System.out.println(b);
			if(b){
				continue;
			}
		}
		temp.next = tail;

	}

	private static void detectLoop() {
		Node slowpointer = tail;
		Node fastpointer = tail;
		while (slowpointer.next != null || fastpointer.next != null) {
			slowpointer = slowpointer.next;
			fastpointer = fastpointer.next;
			if (null != fastpointer) {
				fastpointer = fastpointer.next;
			} else {
				System.out.println("No loop detected");
				break;
			}

			if (slowpointer.data == fastpointer.data) {
				System.out.println("Loop detected at "+slowpointer.data);
				break;
			}

		}
	}

}
