package ques;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SortMapOnValues {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Alpha", 11);
		map.put("Beta", 1);
		map.put("Gamma", 2);
		map.put("Theta", 20);
		map.put("Zeta", 30);
		map.put("Penta", 40);
		map.put("Tera", 5);
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		LinkedList<Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(entrySet);
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				
				return o1.getValue()-o2.getValue();
			}
			
		});
		
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println("Key="+entry.getKey() +" , value="+entry.getValue());
		}
		
	}

}
