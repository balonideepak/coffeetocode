package geeksforgeeks.medium;

import java.util.Arrays;

//http://www.geeksforgeeks.org/smallest-window-contains-characters-string/
public class SmallestWindow {
	public static void main(String[] args) {
		String str = "aabcbcdbca";

		String result = findSmallestWindow(str);
		System.out.println("result=>" + result);
	}

	private static String findSmallestWindow(String str) {

		int MAX_CHARS = 256;
		char dist_arr[] = new char[MAX_CHARS];
		int dist_count = 0;
		Arrays.fill(dist_arr, '0');
		char count_arr[] = new char[MAX_CHARS];
		int start = 0;
		int count = 0;
		int min_len = Integer.MAX_VALUE;
		int start_index = 0;

		for (int i = 0; i < str.length(); i++) {
			if (dist_arr[str.charAt(i)] == '0') {
				dist_arr[str.charAt(i)]++;
				dist_count++;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			count_arr[str.charAt(i)]++;

			if (count_arr[str.charAt(i)] == 1) {
				count++;
			}

			if (count == dist_count) {

				while (count_arr[str.charAt(start)] > 1) {
					count_arr[str.charAt(start)]--;
					start++;
				}
				int length_window = i - start + 1;
				if (min_len > length_window) {
					min_len = length_window;
					start_index = start;

					String s = str
							.substring(start_index, start_index + min_len);
					System.out.println("String containing all characters => " + s);
				}

			}

		}

		return str.substring(start_index, start_index + min_len);
	}
}
