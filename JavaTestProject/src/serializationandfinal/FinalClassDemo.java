package serializationandfinal;

import java.util.HashMap;

public class FinalClassDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		FinalClass obj = new FinalClass("1", "John", map);
		System.out.println("Printing map....");
		HashMap<String, String> map2 = obj.getMap();
		System.out.println(map2);
		map2.put("4", "four");
		System.out.println("Printing map after modification");
		System.out.println(obj.getMap());
	}
}
