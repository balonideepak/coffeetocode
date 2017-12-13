package geeksforgeeks.easy;

public class AddTwoNumbersRepresentedByList {
	public static void main(String[] args) {
		Node n1Root = new Node(5);
		n1Root.next = new Node(6);
		n1Root.next.next = new Node(3);

		Node n2Root = new Node(1);
		n2Root.next = new Node(4);

		Node result = add(n1Root, n2Root);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

	private static Node add(Node first, Node second) {
		// res is head node of the resultant list
		Node prev = null;
		Node res = prev;
		Node temp = null;
		int carry = 0, sum;

		while (first != null || second != null) {
			sum = carry + (first != null ? first.data : 0)
					+ (second != null ? second.data : 0);

			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			temp = new Node(sum);

			if (res == null) {
				res = temp;
			} else // If this is not the first node then connect it to the rest.
			{
				prev.next = temp;
			}

			prev = temp;

			if (first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}

		}

		return res;
	}

	static class Node {
		int data;
		Node next;

		public Node() {
		}

		public Node(int val) {
			this.data = val;
		}

		@Override
		public String toString() {
			return "Node [val=" + data + "]";
		}

	}

}
