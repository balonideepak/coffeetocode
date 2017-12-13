package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test3 {

	/**
	 * @param args
	 */
	
	Map<String,String> map=new HashMap<String, String>();
	
	{
		map.put("initial-key1", "initial-value1");
	}
	
	public static void main(String[] args) {
		System.out.println("main method called of class ::" + Test3.class);
	}
	
	Map<String,String> getMap(){
		return Collections.unmodifiableMap(map);
	}

}
