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

public class HotelRating {
	private static TrieImpl mTrieImpl = new TrieImpl();
	private static TrieNode root = mTrieImpl.getNode();
	private static Map<Integer, Integer> result = new HashMap<Integer, Integer>();

	private static TrieNode getNode() {
		return new TrieNode();
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File(
				"reviews.txt")));
		String searchKeywords = br.readLine();
		if (null == searchKeywords || searchKeywords.length() == 0) {
			br.close();
			return;
		}

		String[] searchKeywordsArr = searchKeywords.split(" ");

		int noOfReviews = Integer.parseInt(br.readLine());
		String line = null;
		int hotelIntId;

		// Trie building for reviews
		for (int i = 0; i < noOfReviews; i++) {
			line = br.readLine();
			hotelIntId = Integer.parseInt(line);

			String[] review = br.readLine().split(" ");
			for (String word : review) {
				// Remove any ' ', ',', '.', '!' or '?' from word
				word = word.replaceAll("[$,.!?]", "").toLowerCase();

				mTrieImpl.insert(root, word.toCharArray(), hotelIntId);
			}
		}

		// Check in trie each review word by iterating over search keyword
		Map<Integer, Integer> hotelsMap = null;
		for (String word : searchKeywordsArr) {
			hotelsMap = mTrieImpl.search(root, word.toCharArray());
			Set<Map.Entry<Integer, Integer>> entrySet = hotelsMap.entrySet();
			int hotelId;
			for (Map.Entry<Integer, Integer> entry : entrySet) {
				hotelId = entry.getKey();
				if (result.containsKey(hotelId)) {
					result.put(hotelId, result.get(hotelId) + 1);
				} else {
					result.put(hotelId, 0);
				}
			}
		}

		//ArrayList<Integer> list = new ArrayList<Integer>();
		Set<Map.Entry<Integer, Integer>> set = result.entrySet();
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
			//list.add(hotelEntry.getKey());
		}
	}

}

class TrieImpl {

	TrieNode getNode() {
		TrieNode mTrieNode = new TrieNode();
		return mTrieNode;
	}

	void insert(TrieNode rootOrignal, char[] word, int hotelIntId) {
		TrieNode root = rootOrignal;
		TrieNode child = null;
		for (int i = 0; i < word.length; i++) {

			if (root.getChildren().get(word[i]) == null) {
				child = getNode();
			} else {
				child = root.getChildren().get(word[i]);
			}
			root.getChildren().put(word[i], child);

			if (i == word.length - 1) {
				root.setCompleteWord(true);
				root.setValue(hotelIntId);
			}
			root = child;
		}

	}

	Map<Integer, Integer> search(TrieNode rootOrignal, char[] word) {
		Map<Integer, Integer> val = null;
		TrieNode runner = rootOrignal;
		for (int i = 0; i < word.length; i++) {
			if (runner.getChildren().get(word[i]) == null) {
				val = new HashMap<Integer, Integer>();
				return val;
			}

			if (i == word.length - 1) {
				val = runner.getValue();
			}
			runner = runner.getChildren().get(word[i]);

		}

		return val;
	}

}

class TrieNode {
	private HashMap<Character, TrieNode> children = new HashMap<>();
	private boolean isCompleteWord = false;
	private Map<Integer, Integer> hotelsMap = new HashMap<Integer, Integer>();


	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}

	public boolean isCompleteWord() {
		return isCompleteWord;
	}

	public void setCompleteWord(boolean completeWord) {
		isCompleteWord = completeWord;
	}

	public void setValue(Integer hotelIntId) {
		if (hotelsMap.containsKey(hotelIntId)) {
			hotelsMap.put(hotelIntId, hotelsMap.get(hotelIntId) + 1);
		} else {
			hotelsMap.put(hotelIntId, 1);
		}

	}

	public Map<Integer, Integer> getValue() {
		return hotelsMap;
	}

}
