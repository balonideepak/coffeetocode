package geeksforgeeks.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfTriangles {

	private static Set<Pair> pairs = new HashSet<Pair>();

	public static void main(String[] args) {
		int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
		int result = countNumberOfTriangles(arr);
		System.out.println(result);

	}

	private static int countNumberOfTriangles(int[] arr) {
		Arrays.sort(arr);
		for (int i = (arr.length - 1); i >= 0; i--) {

			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (arr[i] + arr[r] > arr[l]) {
					System.out.println("Pair =>"+arr[i] + " " + arr[r] + " " + arr[l]);
					Pair pair = new Pair(arr[i], arr[r], arr[l]);
					pairs.add(pair);
					r--;
				}
			}

		}
		return pairs.size();
	}

	static class Pair {
		int first;
		int second;
		int third;

		public Pair(int first, int second, int third) {
			this.first = first;
			this.second = second;
			this.third = third;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + first;
			result = prime * result + second;
			result = prime * result + third;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (first != other.first)
				return false;
			if (second != other.second)
				return false;
			if (third != other.third)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Pair [first=" + first + ", second=" + second + ", third="
					+ third + "]";
		}

	}
}
