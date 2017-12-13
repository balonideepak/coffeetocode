package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//http://www.programcreek.com/2012/12/leetcode-solution-word-break/

public class WordBreak {

	private static String str = "leetcode";
	private static Set<String> dict = new HashSet<>();

	// test case : 2> Str="leetcode" , dict=["leet","code"]
	// test case : 2> Str="leetcode" , dict=["leet","de"]
	static {
		dict.add("leet");
		dict.add("code");
	}

	public static void main(String[] args) {

		int[] pos = new int[str.length()];
		Arrays.fill(pos, -1);
		pos[0] = 0;
		String tmp = null;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				tmp = str.substring(i, j);
				if (dict.contains(tmp)) {
					System.out.println(tmp);
					i=j-1;
				}
			}
		}

	}

}
