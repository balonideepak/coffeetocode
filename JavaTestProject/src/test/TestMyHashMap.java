package test;

import api.MyHashMap;

public class TestMyHashMap {

	/**
	 * @author deepak.baloni 
	 * @param args
	 */
	public static void main(String[] args) {

		MyHashMap<String, String> myHashMap=new MyHashMap<String, String>();
		 String str1=myHashMap.put("1", "ONE");
		 String str2=myHashMap.put("1", "one");
		 String str3=myHashMap.put("2", "TWO");
		 String str4=myHashMap.put("3", "THREE");
		 String str5=myHashMap.put("3", "three");
		 
		 System.out.println("str1::"+str1+" , str2::"+str2+" , str3::"+str3+" , str4::"+str4+" , str5::"+str5);
		 System.out.println(myHashMap.get("1"));
	}

}
