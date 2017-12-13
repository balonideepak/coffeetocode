package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrieSolution {

	private static TrieNode root = getNode();

	private static TrieNode getNode() {
		return new TrieSolution().new TrieNode();
	}

	private static TrieNode getNode(char c) {
		return new TrieSolution().new TrieNode(c);
	}

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();

		BufferedReader br = new BufferedReader(new FileReader(new File(
				"reviews.txt")));
		String searchKeywords = br.readLine();
		if (null == searchKeywords || searchKeywords.length() == 0) {
			br.close();
			return;
		}

		String[] searchKeywordsArr = searchKeywords.split(" ");

		for (String word : searchKeywordsArr) {
			insert(word);
		}

		Map<Integer, Integer> hotelsMap = new HashMap<Integer, Integer>();
		int noOfReviews = Integer.parseInt(br.readLine());
		String line = null;
		int hotelIntId;
		for (int i = 0; i < noOfReviews; i++) {
			line = br.readLine();
			hotelIntId = Integer.parseInt(line);

			if (!hotelsMap.containsKey(hotelIntId)) {
				hotelsMap.put(hotelIntId, 0);
			}

			// Read review text
			String[] review = br.readLine().split(" ");
			for (String word : review) {
				// Remove any ' ', ',', '.', '!' or '?' from word
				word = word.replaceAll("[$,.!?]", "").toLowerCase();

				if (isPresent(word) != null) {
					hotelsMap.put(hotelIntId, hotelsMap.get(hotelIntId) + 1);
				}
			}
		}

		Set<Map.Entry<Integer, Integer>> set = hotelsMap.entrySet();
		List<Map.Entry<Integer, Integer>> sorted = new ArrayList<Map.Entry<Integer, Integer>>(
				set);

		Collections.sort(sorted, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1,
					Map.Entry<Integer, Integer> o2) {

				if (o1.getValue() == o2.getValue()) {
					return o1.getKey() - o2.getKey();
				} else {
					return o2.getValue() - o1.getValue();
				}
			}

		});

		for (Map.Entry<Integer, Integer> hotelEntry : sorted) {
			System.out.print(hotelEntry.getKey() + " ");
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken=" + ((end - start) ));

	}

	private static void insert(String word) {

		Map<Character, TrieNode> children = root.getChildren();
		TrieNode trieNode = null;
		char c;

		for (int i = 0; i < word.length(); i++) {
			c = word.charAt(i);
			if (children.containsKey(c)) {
				trieNode = children.get(c);
			} else {
				trieNode = getNode(c);
				children.put(c, trieNode);
			}

			children = trieNode.getChildren();

			if (i == word.length() - 1) {
				trieNode.setTerminal(true);
			}
		}
	}

	private static TrieNode isPresent(String word) {

		Map<Character, TrieNode> children = root.getChildren();
		char c;
		TrieNode trieNode = null;
		for (int i = 0; i < word.length(); i++) {
			c = word.charAt(i);
			if (children.containsKey(c)) {
				trieNode = children.get(c);
				children = trieNode.getChildren();
			} else {
				return null;
			}
		}

		return trieNode;
	}

	class TrieNode {

		private char c;
		Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		private boolean isTerminal;

		public TrieNode() {
		}

		public TrieNode(char c) {
			this.c = c;
		}

		public char getC() {
			return c;
		}

		public void setC(char c) {
			this.c = c;
		}

		public Map<Character, TrieNode> getChildren() {
			return children;
		}

		public void setChildren(Map<Character, TrieNode> children) {
			this.children = children;
		}

		public boolean isTerminal() {
			return isTerminal;
		}

		public void setTerminal(boolean isTerminal) {
			this.isTerminal = isTerminal;
		}

	}
}