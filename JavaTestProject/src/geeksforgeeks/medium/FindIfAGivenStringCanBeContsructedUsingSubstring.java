package geeksforgeeks.medium;

import java.util.ArrayList;

//http://www.geeksforgeeks.org/find-given-string-can-represented-substring-iterating-substring-n-times/

//Solution > https://angshukutu.wordpress.com/2015/03/09/find-if-a-given-string-can-be-represented-from-a-substring-by-iterating-the-substring-n-times/

public class FindIfAGivenStringCanBeContsructedUsingSubstring {

	public static void main(String[] args) {
		System.out.println(strFromsubStr("abcdabc")); // abadabad > true ;
														// abcdabc > false
	}

	public static ArrayList<Integer> factorsOfNum(int num) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		int i = 1;
		while (i <= num / 2) {
			if (num % i == 0) {
				results.add(i);
			}
			i++;
		}
		return results;
	}

	// complexity (kn) k - number of factors, n - length of s
	public static boolean strFromsubStr(String s) {
		boolean reconstructible = false;
		int len = s.length();
		ArrayList<Integer> facts = factorsOfNum(len);
		for (Integer n : facts) {
			String cur = s.substring(0, n);
			int l = cur.length();
			int times = len / l;
			String res = "";

			while (times > 0) {
				res += cur;
				times--;
			}
			if (res.equals(s)) {
				reconstructible = true;
				break;
			}
		}
		return reconstructible;
	}

}
