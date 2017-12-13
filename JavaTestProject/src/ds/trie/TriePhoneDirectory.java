package ds.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TriePhoneDirectory {

	public static void main(String[] args) {
		String[] wordArr = { "john", "joe" };

		TrieNode root = new TrieNode();
		buildTrie(wordArr, root);

		ArrayList<String> list = new ArrayList<String>();
		displayContacts("jo", root, list);
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

	private static void displayContacts(String word, TrieNode root,
			ArrayList<String> list) {
		TrieNode node = null;
		Map<Character, TrieNode> children = root.getChildren();
		String prefix = "";
		for (int i = 0; i < word.length(); i++) {
			if (children.containsKey(word.charAt(i))) {
				node = children.get(word.charAt(i));
				children = node.getChildren();
				prefix += word.charAt(i);
			} else {
				System.out.println("No result found");
				return;
			}
		}

		displayContactsUtil(node, list, prefix);

		for (String contact : list) {
			System.out.println(contact);
		}

	}

	private static void displayContactsUtil(TrieNode node,
			ArrayList<String> list, String contact) {

		if (node.isTerminal) {
			list.add(contact);
		}
		for (char i = 'a'; i < 'z'; i++) {
			TrieNode lNode = node.getChildren().get(i);
			if (lNode != null) {
				displayContactsUtil(lNode, list, contact + i);
			}

		}

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
