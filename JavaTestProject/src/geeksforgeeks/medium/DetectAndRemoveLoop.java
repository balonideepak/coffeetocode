package geeksforgeeks.medium;

public class DetectAndRemoveLoop {
	private static Node root = null;

	public static void main(String[] args) {
		DetectAndRemoveLoop OBJ = new DetectAndRemoveLoop();
		root = OBJ.new Node(1);
		root.next = OBJ.new Node(2);
		root.next.next = OBJ.new Node(3);
		root.next.next.next = OBJ.new Node(4);
		root.next.next.next.next = OBJ.new Node(5);
		// root.next.next.next.next.next = root.next;//loop condition

		detectAndRemoveLoop();

	}

	private static void detectAndRemoveLoop() {

		boolean isVisited = false;
		Node node = root;

		while (!isVisited) {

			System.out.println(node.data);

			if (node.next != null) {
				isVisited = node.next.isVisited;
			} else {
				System.out.println("No loop found");
				break;
			}

			if (isVisited) {
				node.next = null;
				System.out.println("Loop found at node =>" + node.data);
				break;
			} else {
				node.isVisited = true;
				node = node.next;
			}

		}

	}

	class Node {
		int data;
		Node next;
		boolean isVisited;

		Node(int data) {
			this.data = data;
		}

	}
}
