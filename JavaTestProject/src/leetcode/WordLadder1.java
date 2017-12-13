package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadder1 {
	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		int ladderLength = ladderLength(start, end);
		System.out.println(ladderLength);
	}

	private static int ladderLength(String start, String end) {
		Set<String> wordDict = new HashSet<String>();
		wordDict.add("hot");
		wordDict.add("dot");
		wordDict.add("lot");
		wordDict.add("dog");
		wordDict.add("log");
		wordDict.add(end);

		LinkedList<Word> queue = new LinkedList<Word>();
		queue.add(new Word(start, 1));
		while (!queue.isEmpty()) {
			Word word = queue.poll();
			String lword = word.word;

			if (end.equals(lword)) {
				return word.numSteps;
			}

			char[] arr = lword.toCharArray();
			for (int i = 0; i < lword.length(); i++) {
				for (char c = 'a'; c <= 'z'; c++) {
					char temp = arr[i];

					if (arr[i] != c) {
						arr[i] = c;
					}

					String newWord = new String(arr);
					if (wordDict.contains(newWord)) {
						queue.add(new Word(newWord, word.numSteps + 1));
						wordDict.remove(newWord);
					}

					arr[i] = temp;

				}
			}

		}

		return 0;
	}

	static class Word {
		String word;
		int numSteps;

		public Word(String word, int numSteps) {
			this.word = word;
			this.numSteps = numSteps;
		}

		@Override
		public String toString() {
			return "Word [word=" + word + "]";
		}

	}
}
