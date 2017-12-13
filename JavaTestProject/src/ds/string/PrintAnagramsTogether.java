package ds.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//http://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together/
public class PrintAnagramsTogether {
	public static void main(String[] args) {
		String strArr[] = { "cat", "dog", "tac", "god", "act" };
		Map<Integer, String> map = new HashMap<>();
		int key = 0;
		for (String str : strArr) {
			key = str.hashCode();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + " , " + str);
			} else {
				map.put(key, str);
			}

		}
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " > " + entry.getValue());
		}

	}
}
