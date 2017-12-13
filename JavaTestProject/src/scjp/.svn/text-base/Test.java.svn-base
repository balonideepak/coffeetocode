package scjp;

import java.util.ArrayList;

public class Test {

	public static void main(String argv[]) {

		ArrayList list = new ArrayList();
		ArrayList<String> listStr = list;
		ArrayList<StringBuffer> listBuf = list;
		listStr.add(0, "Hello");
		StringBuffer buff = listBuf.get(0);
		System.out.println(buff.toString());
	
	}

}

/*****
 * 
 * Explanation : java.lang.String cannot be cast to java.lang.StringBuffer at
 * the code StringBuffer buff = listBuf.get(0); So thows
 * java.lang.ClassCastException.
 * 
 * *******/
