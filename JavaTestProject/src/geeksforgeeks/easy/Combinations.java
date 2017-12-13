package geeksforgeeks.easy;

public class Combinations {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 6 };
		int N = arr.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				String s = "";
				for (int k = i; k <= j; k++) {
					s = s + " " + arr[k];
				}
				System.out.println(s);
			}
		}
	}
}
