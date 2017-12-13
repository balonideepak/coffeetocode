package geeksforgeeks.medium;

public class FindWaterInAGlass {

	public static void main(String[] args) {

		float water = 2.0f;
		int row = 3;
		int column = 2;

		float result = findWater(water, row, column);
		System.out.println("water at row=" + row + " and column=" + column
				+ " => " + result);

	}

	private static float findWater(float water, int row, int column) {

		int size = row * (row + 1) / 2;
		float glass[] = new float[size];
		int index = 0;
		glass[index] = water;

		for (int r = 1; r < row && water != 0.0f; ++r) {
			for (int c = 0; c < r; ++c, ++index) {
				water = glass[index];
				glass[index] = (water >= 1.0f) ? 1.0f : water;
				water = (water >= 1) ? (water - 1) : 0.0f;
				glass[index + r] = glass[index + r] + water / 2;
				glass[index + r + 1] = glass[index + r + 1] + water / 2;
			}
		}

		return glass[row * (row - 1) / 2 + column - 1];

	}
}
