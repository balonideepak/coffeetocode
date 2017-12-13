package ds.linkedlist.singlelinklist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDupsInUnsortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Link link = new Link(10);
		link.next = new Link(20);
		link.next.next = new Link(30);
		link.next.next.next = new Link(40);
		link.next.next.next.next = new Link(10);
		link.next.next.next.next.next = new Link(20);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		Link current = link;
		while (current != null) {
			if (map.get(current.data) == null) {
				map.put(current.data, 1);
			}
			current=current.next;
		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
		}
		
	}
}
