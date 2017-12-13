package ds.string;

import java.util.Arrays;

public class StringAnagram1 {
	private static String str1 = "abc";
	private static String str2 = "cbb";

	public static void main(String[] args) {
		
		if (str1.length() != str2.length()) {
			System.out
					.println("[ERROR ] : Strings are not anagrams of each other");
		}

		method1();
		method2();

	}

	private static void method1() {

		char[] _charArray1 = str1.toCharArray();
		Arrays.sort(_charArray1);
		String _str1 = new String(_charArray1);

		char[] _charArray2 = str2.toCharArray();
		Arrays.sort(_charArray2);
		String _str2 = new String(_charArray2);

		for (int i = 0; i < _str1.length(); i++) {
			if (_str1.charAt(i) != _str2.charAt(i)) {
				System.out
						.println("[Method1 ]: Strings are not anagrams of each other");
				return;
			}
		}

		System.out.println("[Method1 ]: Strings are anagrams of each other");

	}

	private static void method2() {
		char charArr[] = new char[256];
		for (int i = 0; i < str1.length(); i++) {
			charArr[str1.charAt(i)]++;
			charArr[str2.charAt(i)]--;
		}

		for (char c : charArr) {
			if (c >= 1) {
				System.out
						.println("[Method2 ]: Strings are not anagrams of each other");
				return;
			}
		}

		System.out.println("[Method2 ]: Strings are  anagrams of each other");
	}
}
