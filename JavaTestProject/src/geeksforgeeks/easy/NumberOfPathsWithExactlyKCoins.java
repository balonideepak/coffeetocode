package geeksforgeeks.easy;

public class NumberOfPathsWithExactlyKCoins {
	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 }, { 4, 6, 5 }, { 4, 2, 1 } };
		long start = System.nanoTime();
		findPath(mat, 0, 0, 0, 12, "");
		long end = System.nanoTime();
		System.out.println((end - start)/(1000*1000));

	}

	private static boolean findPath(int[][] mat, int x, int y, int sum,
			int target, String path) {

		if (isSafe(mat, x, y)) {
			int lsum = sum + mat[x][y];
			String lpath = path + " " + mat[x][y];
			if (findPath(mat, x, y + 1, lsum, target, lpath)) {
				return true;
			}

			lsum = sum + mat[x][y];
			lpath = path + " " + mat[x][y];
			if (findPath(mat, x + 1, y, lsum, target, lpath)) {
				return true;
			}

			if (target == lsum) {
				System.out.println(lpath);
			}
			return false;
		}
		return false;
	}

	private static boolean isSafe(int[][] mat, int x, int y) {
		if (x < mat.length && y < mat[0].length) {
			return true;
		}
		return false;
	}
}
