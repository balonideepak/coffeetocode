package puzzles;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupFromStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abca defb";
		Set<Character> set=new HashSet<Character>();
		char[] charArray = str.toCharArray();
		String result="";
		for (char c : charArray) {
			if(!set.contains(c)){
				set.add(c);
				result=result+c;
			}
		}
		
		System.out.println("Input was ::"+str+"  and \n result after removing duplicates is ::"+result);
	}

}
