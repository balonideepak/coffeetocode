package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
		String s = "aab";
		String t = "zxy";

		System.out.println(isIsomorphic(s, t));
	}

	private static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length())
			return false;

		Map<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char charInS = s.charAt(i);
			char charInT = t.charAt(i);
			if (charInS != charInT) {
				if (null == map.get(charInS)) {
					map.put(charInS, charInT);
				} else if (map.get(charInS) != charInT) {
					return false;
				}
			}
		}

		return true;
	}

}
