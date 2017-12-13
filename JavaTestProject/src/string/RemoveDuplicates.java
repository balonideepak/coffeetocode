package string;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	/**
	 * @author deepak.baloni
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abbcdddddd";
		
		/**************** 1st Method **********************/
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			set.add(str.charAt(i));
		}
		System.out.println(set.toString());
		
		
		/**************** 2nd Method **********************/
		String newStr="";
		int[] arr = new int[255];
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (arr[charAt] == 0) {
				arr[charAt] = 1;
				newStr=newStr+charAt;
			} else {
				int count = arr[charAt];
				arr[charAt] = ++count;
			}
		}
		System.out.println(newStr);
		
		
		/*********** 3rd Method *******************/
		
		
	}

}
