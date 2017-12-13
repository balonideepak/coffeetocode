package geeksforgeeks.easy;

public class Solution {

	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		ListNode rotateRight = rotateRight(root, 1);
		while (rotateRight != null) {
			System.out.println(rotateRight.val);
			rotateRight = rotateRight.next;
		}
	}

	public static ListNode rotateRight(ListNode a, int b) {

		ListNode temp = a;
		ListNode firstHalfStart = a;

		int size = 0;

		while (temp != null) {
			size++;
			temp = temp.next;
		}

		int partitionIndex = size - b;

		ListNode firstHalf = a;
		for (int i = 0; i < partitionIndex - 1; i++) {
			firstHalf = firstHalf.next;
		}

		ListNode secondHalf = firstHalf.next;
		ListNode secondHalfStart = firstHalf.next;
		firstHalf.next=null;

		for (int i = partitionIndex; i < size - 1; i++) {
			secondHalf = secondHalf.next;
		}

		secondHalf.next = firstHalfStart;

		return secondHalfStart;

	}

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + "]";
		}

	}
}
