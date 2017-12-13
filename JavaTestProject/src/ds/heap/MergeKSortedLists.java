package ds.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	public static void main(String[] args) {

		ListNode a[] = new ListNode[3];

		a[0] = new ListNode(1);
		a[0].next = new ListNode(3);
		a[0].next.next = new ListNode(5);
		a[0].next.next.next = new ListNode(7);

		a[1] = new ListNode(2);
		a[1].next = new ListNode(4);
		a[1].next.next = new ListNode(6);
		a[1].next.next.next = new ListNode(8);

		a[2] = new ListNode(0);
		a[2].next = new ListNode(9);
		a[2].next.next = new ListNode(10);
		a[2].next.next.next = new ListNode(11);

		PriorityQueue<ListNode> pq = new PriorityQueue<>(
				new Comparator<ListNode>() {

					@Override
					public int compare(ListNode l1, ListNode l2) {
						return l1.val - l2.val;
					}

				});


		ListNode head = new ListNode(0);
		ListNode p = head;

		for (ListNode list : a) {
			if (list != null)
				pq.offer(list);
		}

		while (!pq.isEmpty()) {
			ListNode n = pq.poll();
			p.next = n;
			p = p.next;

			if (n.next != null)
				pq.offer(n.next);
		}

		//Answer > head.next
		
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
