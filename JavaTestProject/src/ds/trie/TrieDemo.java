package ds.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieDemo {

	private static String[] wordArr = { "john", "joe" };
	private static String[] wordSearchArr = { "jo", "john", "joe", "deepak" };
	private static TrieNode root = getNode();

	private static TrieNode getNode() {
		return new TrieDemo().new TrieNode();
	}

	private static TrieNode getNode(char c) {
		return new TrieDemo().new TrieNode(c);
	}

	public static void main(String[] args) {
		buildTrie();

		for (String word : wordSearchArr) {
			TrieNode result = searchNode(word);
			if (null == result) {
				System.out.println("'" + word + "'  not found ");
			} else {
				System.out.println("'" + word + "'  found ");
			}
		}

	}

	private static void buildTrie() {
		for (String word : wordArr) {
			insert(word);
		}
	}

	private static void insert(String word) {
		Map<Character, TrieNode> children = root.getChildren();
		for (int i = 0; i < word.length(); i++) {
			TrieNode trieNode = null;
			char charAt = word.charAt(i);
			if (children.containsKey(charAt)) {
				trieNode = children.get(charAt);
			} else {
				trieNode = getNode(charAt);
				children.put(charAt, trieNode);
			}

			children = trieNode.getChildren();

			if (i == word.length() - 1) {
				trieNode.setTerminal(true);
			}

		}

	}

	private static TrieNode searchNode(String word) {
		Map<Character, TrieNode> children = root.getChildren();
		char charAt;
		TrieNode node = null;
		for (int i = 0; i < word.length(); i++) {
			charAt = word.charAt(i);
			if (children.containsKey(charAt)) {
				node = children.get(charAt);
				children = node.getChildren();
			} else {
				return null;
			}
		}

		return node;
	}

	class TrieNode {
		Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		boolean isTerminal;
		char c;

		public TrieNode() {
		}

		public TrieNode(char c) {
			this.c = c;
		}

		public Character getC() {
			return c;
		}

		public void setC(Character c) {
			this.c = c;
		}

		public Map<Character, TrieNode> getChildren() {
			return children;
		}

		public void setChildren(Map<Character, TrieNode> map) {
			this.children = map;
		}

		public boolean isTerminal() {
			return isTerminal;
		}

		public void setTerminal(boolean isTerminal) {
			this.isTerminal = isTerminal;
		}

	}

}
