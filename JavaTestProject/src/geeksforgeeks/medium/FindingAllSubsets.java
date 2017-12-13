package geeksforgeeks.medium;

import java.util.HashSet;
import java.util.Set;

public class FindingAllSubsets {

	private static Set<String> uniqueset = new HashSet<String>();

	public static void main(String[] args) {
		char set[] = { 'a', 'b', 'c' };

		printSubsets(set);

	}

	static void printSubsets(char set[]) {
		int n = set.length;

		// Run a loop for printing all 2^n
		// subsets one by obe
		for (int i = 0; i < (1 << n); i++) {

			String result = "";
			// Print current subset
			for (int j = 0; j < n; j++)

				// (1<<j) is a number with jth bit 1
				// so when we 'and' them with the
				// subset number we get which numbers
				// are present in the subset and which
				// are not
				if ((i & (1 << j)) > 0) {
					result += set[j] + " ";
				}

			if (!uniqueset.contains(result)) {
				System.out.print("{ ");
				System.out.print(result);
				uniqueset.add(result);
				System.out.println("}");
			}

		}
	}
}
