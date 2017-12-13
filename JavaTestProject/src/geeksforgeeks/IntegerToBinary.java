package geeksforgeeks;

public class IntegerToBinary {

	public static void main(String[] args) {
		int n = 2;
		calculateBinary(n);
	}

	private static void calculateBinary(int x) {
		if (x != 0) {
			calculateBinary(x / 2);
			System.out.print(x % 2 + " ");
		}
	}

}
