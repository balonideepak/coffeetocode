package geeksforgeeks.medium;

//http://www.geeksforgeeks.org/rearrange-characters-string-no-two-adjacent/

import java.util.PriorityQueue;

class MyPair  implements Comparable<MyPair> {
	char c;
	int count;

	@Override
	public int compareTo(MyPair o) {
		return this.count < o.count ? 1 : -1;
	}

	@Override
	public String toString() {
		return "MyPDPair [c=" + c + ", count=" + count + "]";
	}

}

public class RearrangeCharNotAdj {
	public static void main(String[] args) {
		String inp = "aaaaaabc";
		int[] chrArr = new int[26];
		for (char c : inp.toCharArray()) {
			chrArr[c - 'a'] += 1;
		}
		PriorityQueue<MyPair> pq = new PriorityQueue<MyPair>();
		for (int i = 0; i < 26; i++) {
			if (chrArr[i] != 0) {
				MyPair pair = new MyPair();
				pair.c = (char) (i + 'a');
				pair.count = chrArr[i];
				pq.add(pair);
			}
		}
		MyPair prev = null;
		StringBuffer sb = new StringBuffer();
		while (!pq.isEmpty()) {
			MyPair tmp = prev;
			MyPair cur = pq.poll();
			if (cur.count == 0) {
				break;
			}
			cur.count = cur.count - 1;
			sb.append(cur.c);

			if (tmp != null) {
				pq.add(tmp);
			}
			prev = cur;
		}
		if (inp.length() == sb.length()) {
			System.out.println(sb.toString());
		} else {
			System.out.println("Not possible>>");
		}
	}
}
