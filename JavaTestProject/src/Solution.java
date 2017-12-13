import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {

	int currentSize;
	int index;
	Set<Integer> set;
	Map<Integer, Integer> indexes;
	Map<Integer, Integer> map;
	int capacity;

	public static void main(String[] args) {
		Solution solution = new Solution(1);
		solution.set(2, 1);
		solution.get(2);
		solution.set(3, 2);
		solution.get(2);
		solution.get(3);
		solution.set(4, 1);
		solution.set(5, 1);
		solution.set(6, 1);
		solution.get(4);
		solution.get(5);
		solution.get(6);

	}

	public Solution(int capacity) {
		this.capacity = capacity;
		currentSize = 0;
		index = 0;
		set = new HashSet<Integer>();
		indexes = new HashMap<Integer, Integer>();
		map = new HashMap<Integer, Integer>();

	}

	public int get(int key) {
		int val = -1;
		if (map.containsKey(key)) {
			++index;
			val = map.get(key);
			indexes.put(val, index);

			System.out.println(val);
			return val;
		} else {
			System.out.println(val);
			return -1;
		}
	}

	public void set(int key, int value) {

		Integer l_val = map.get(key);

		if (null != l_val && l_val == value) {
			++index;
			indexes.put(value, index);
			return;
		}

		if (currentSize < capacity) {
			set.add(key);
			++index;
			indexes.put(value, index);
			map.put(key, value);
			currentSize++;
		} else {

			int minIndex = Integer.MAX_VALUE;
			int lvalue = 0;

			for (Integer keyname : indexes.keySet()) {
				int val = indexes.get(keyname);
				if (minIndex > val) {
					minIndex = val;
					lvalue = keyname;

				}
			}

			set.remove(lvalue);
			currentSize--;
			for (Iterator<Map.Entry<Integer, Integer>> it = map.entrySet()
					.iterator(); it.hasNext();) {
				Map.Entry<Integer, Integer> entry = it.next();
				if (entry.getValue().equals(lvalue)) {
					it.remove();
				}
			}
			
			set.add(key);
			++index;
			indexes.put(value, index);
			map.put(key, value);
			currentSize++;
			
			
		}

	}
}
