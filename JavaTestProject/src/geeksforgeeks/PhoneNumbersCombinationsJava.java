package geeksforgeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//http://www.geeksforgeeks.org/find-possible-words-phone-digits/

// https://www.programcreek.com/2014/04/leetcode-letter-combinations-of-a-phone-number-java/

public class PhoneNumbersCombinationsJava {
	public static void main(String[] args) {

		Map<Integer, String> keypad = new HashMap<Integer, String>();
		keypad.put(2, "abc");
		keypad.put(3, "def");
		keypad.put(4, "ghi");
		keypad.put(5, "jkl");
		keypad.put(6, "mno");
		keypad.put(7, "pqrs");
		keypad.put(8, "tuv");
		keypad.put(9, "wxyz");
		ArrayList<String> result = new ArrayList<String>();
		String digits = "234";

		ArrayList<Character> temp = new ArrayList<Character>();
		printCombinations(digits, keypad, temp, result);
		for (String str : result) {
			System.out.println(str);
		}

	}

	private static void printCombinations(String digits,
			Map<Integer, String> keypad, ArrayList<Character> temp,
			ArrayList<String> result) {

		if (digits.length() == 0) {
			result.add(temp.toString());
			return;
		}

		String digit = digits.substring(0, 1);
		String letters = keypad.get(Integer.parseInt(digit));
		for (int i = 0; i < letters.length(); i++) {
			temp.add(letters.charAt(i));
			printCombinations(digits.substring(1), keypad, temp, result);
			temp.remove(temp.size() - 1);
		}

	}
}
