package prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("One", "1");
		map.put("Two", "2");
		map.put("Three", "3");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+" , "+entry.getValue());
		}
	}
}
