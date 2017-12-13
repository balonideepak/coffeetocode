package misc;

public class Factors {
	public static void main(String[] args) {
		int num = 16;
		printfactors(num);

	}

	private static void printfactors(int num) {

		while (num % 2 == 0) {
			System.out.print(2 + " ");
			num /= 2;
		}

		for (int i = 3; i  <= num; i = i + 2) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}

	}
}
