package geeksforgeeks.backtrack;

public class RatInAMaze {
	private static int ROWS = 4;
	private static int COLS = 4;
	private static int sol[][] = new int[ROWS][COLS];
	private static int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 },
			{ 0, 1, 0, 0 }, { 1, 1, 1, 1 } };

	public static void main(String[] args) {
		boolean result = solveMaze(0, 0);
		System.out.println("Path exist=" + result);
		if (result) {
			printSolution(sol);
		}
	}

	private static boolean solveMaze(int x, int y) {

		if (x == ROWS - 1 && y == COLS - 1) {
			sol[x][y] = 1;
			return true;
		}

		if (isSafeMove(x, y)) {

			sol[x][y] = 1;

			if (solveMaze(x + 1, y)) {
				return true;
			}

			if (solveMaze(x, y + 1)) {
				return true;
			}

			sol[x][y] = 0;
			return false;

		}

		return false;

	}

	private static boolean isSafeMove(int x, int y) {
		return (x < ROWS && y < COLS && maze[x][y] == 1);
	}

	private static void printSolution(int sol[][]) {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++)
				System.out.print(" " + sol[i][j] + " ");
			System.out.println();
		}
	}
}
