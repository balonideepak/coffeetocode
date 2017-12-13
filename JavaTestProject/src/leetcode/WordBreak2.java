package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//https://www.programcreek.com/2014/03/leetcode-word-break-ii-java/
public class WordBreak2 {
	public static void main(String[] args) {
		ArrayList<String> search = search();
		for (String string : search) {
			System.out.println(string);
		}
	}

	private static ArrayList<String> search() {
		Set<String> dict = new HashSet<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		String str = "catsanddog";

		ArrayList<String>[] pos = new ArrayList[str.length() + 1];
		pos[0] = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			if (pos[i] != null) {
				for (int j = i + 1; j <= str.length(); j++) {
					String sub = str.substring(i, j);
					if (dict.contains(sub)) {
						if (pos[j] == null) {
							ArrayList<String> list = new ArrayList<String>();
							list.add(sub);
							pos[j] = list;
						} else {
							pos[j].add(sub);
						}

					}
				}
			}
		}

		if (pos[str.length()] == null) {
			return new ArrayList<String>();
		} else {
			ArrayList<String> result = new ArrayList<String>();
			dfs(pos, result, "", str.length());
			return result;
		}
	}

	public static void dfs(ArrayList<String>[] pos, ArrayList<String> result,
			String curr, int i) {
		if (i == 0) {
			result.add(curr.trim());
			return;
		}

		for (String s : pos[i]) {
			String combined = s + " " + curr;
			dfs(pos, result, combined, i - s.length());
		}
	}
}
