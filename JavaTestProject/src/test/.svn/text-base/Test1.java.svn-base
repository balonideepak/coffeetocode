package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	static {
		System.out.println("static block called...");
	}

	{
		System.out.println("non-static block called...");
	}

	public Test1() {
		System.out.println("default constructor called...");
	}
	
	public static void main(String[] args) {
		new Test1();
		Test3 test3Obj = new Test3();
		Map<String, String> map1 = test3Obj.getMap();
		map1.put("junk-key1", "junk-value-1");
		
		
		Map<String, String> map2 = test3Obj.getMap();
		map2.put("junk-key2", "junk-value-2");
		
		Map<String, String> modifiedmap=test3Obj.getMap();
		Set<Entry<String, String>> entrySet = modifiedmap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+" , "+entry.getValue());
		}
	}
}
