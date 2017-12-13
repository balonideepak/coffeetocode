package ds.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieRevision {

	public static void main(String[] args) {
		String[] wordArr = { "john", "joe" };
		String[] wordSearchArr = { "jo", "john", "joe", "deepak" };

		TrieNode root = new TrieNode();
		buildTrie(wordArr, root);

		search(wordSearchArr, root);
	}

	private static void buildTrie(String[] wordArr, TrieNode root) {
		Map<Character, TrieNode> children = null;
		
		for (String word : wordArr) {
			children = root.getChildren();
			
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				TrieNode node = null;
				if (!children.containsKey(c)) {
					node = new TrieNode(c);
					children.put(c, node);
				} else {
					node = children.get(c);
				}
				children = node.getChildren();
				if (i == word.length() - 1) {
					node.setTerminal(true);
				}
			}
			
			
		}
	}

	private static void search(String[] wordSearchArr, TrieNode root) {
		for (String word : wordSearchArr) {
			TrieNode result = searchUtil(root, word);
			if (null == result) {
				System.out.println("word = " + word + " not found");
			} else {
				System.out.println("word = " + word + "  found");
			}
		}
	}

	private static TrieNode searchUtil(TrieNode root, String word) {
		char[] charArray = word.toCharArray();
		Map<Character, TrieNode> children = root.getChildren();
		TrieNode node = null;
		for (char c : charArray) {
			if (children.containsKey(c)) {
				node = children.get(c);
				children=node.getChildren();
			} else {
				return null;
			}
		}
		return node;
	}

	static class TrieNode {
		private Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		private boolean isTerminal;
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

		public void setChildren(Map<Character, TrieNode> children) {
			this.children = children;
		}

		public boolean isTerminal() {
			return isTerminal;
		}

		public void setTerminal(boolean isTerminal) {
			this.isTerminal = isTerminal;
		}

		@Override
		public String toString() {
			return "TrieNode [children=" + children + ", isTerminal="
					+ isTerminal + "]";
		}

	}
}
