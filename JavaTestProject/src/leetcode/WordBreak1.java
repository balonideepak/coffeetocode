package leetcode;

//https://www.programcreek.com/2012/12/leetcode-solution-word-break/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak1 {
	public static void main(String[] args) {
		boolean result = search();
		System.out.println("Result > " + result);
	}

	private static boolean search() {
		Set<String> dict = new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		// test case 1
		String str = "leetcode";
		// test case 2 > str="leetscode"; > comment line no. 28 and 34 , then it
		// will pass
		String subStr = null;
		int[] pos = new int[str.length() + 1];
		Arrays.fill(pos, -1);
		pos[0] = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (pos[i] != -1) {
					subStr = str.substring(i, j);
					if (dict.contains(subStr)) {
						System.out.println(subStr);
						pos[j] = i;
					}
				}
			}
		}
		return pos[str.length()] != -1;

	}
}
