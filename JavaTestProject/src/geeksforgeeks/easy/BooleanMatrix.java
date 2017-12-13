package geeksforgeeks.easy;

import java.util.HashSet;
import java.util.Set;

//http://www.geeksforgeeks.org/a-boolean-matrix-question/
public class BooleanMatrix {
	public static void main(String[] args) {

		// int mat[][] = { { 0, 0, 0 }, { 0, 0, 1 } };
		int mat[][] = { { 1, 0, 0, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } };

		System.out.println("Before.....");

		printMatrix(mat);

		Set<Integer> rowSet = new HashSet<Integer>();
		Set<Integer> columnSet = new HashSet<Integer>();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1) {
					rowSet.add(i);
					columnSet.add(j);
				}
			}
		}

		for (Integer row : rowSet) {
			for (int col = 0; col < mat[0].length; col++) {
				mat[row][col] = 1;
			}
		}

		for (Integer column : columnSet) {
			for (int row = 0; row < mat.length; row++) {
				mat[row][column] = 1;
			}
		}

		System.out.println("After.....");

		printMatrix(mat);

	}

	private static void printMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
