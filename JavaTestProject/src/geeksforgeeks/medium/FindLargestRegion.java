package geeksforgeeks.medium;

public class FindLargestRegion {

	public static void main(String[] args) {
		int maxRegion = 0;
		int matrix[][] = { { 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 },
				{ 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1 } };

		// int matrix[][] = { { 0, 1 }, { 1, 1 } };

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == 1) {
					int size = getBiggestRegion(matrix, row, column);
					System.out.println(size);
					// maxRegion = Math.max(size, maxRegion);
				}
			}

		}

		System.out.println(maxRegion);

	}

	private static int getBiggestRegion(int[][] matrix, int row, int column) {
		if (row < 0 || column < 0 || row >= matrix.length
				|| column >= matrix[row].length) {
			return 0;
		}

		if (matrix[row][column] == 0) {
			return 0;
		}

		matrix[row][column] = 0;
		int size = 1;
		for (int r = row - 1; r <= row + 1; r++) {
			for (int c = column - 1; c <= column + 1; c++) {
				size += getBiggestRegion(matrix, r, c);
			}
		}

		return size;
	}
}
