package geeksforgeeks.medium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SmallestWindowContainsCharacters {
	public static void main(String[] args) {

		String str = "aaab";
		Set<Character> uniqueChars = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			uniqueChars.add(str.charAt(i));
		}

		for (int i = 0; i < str.length(); i++) {
			Set<Character> set = new LinkedHashSet<Character>();
			set.add(str.charAt(i));
			for (int j = i + 1; j < str.length(); j++) {
				if (set.contains(str.charAt(j))) {
					break;
				}
				set.add(str.charAt(j));
			}

			if (uniqueChars.size() == set.size()) {
				System.out.println(set);
				break;
			}
		}

	}
}
