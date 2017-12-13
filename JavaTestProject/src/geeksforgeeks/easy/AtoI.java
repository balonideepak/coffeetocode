package geeksforgeeks.easy;

public class AtoI {
	public static void main(String[] args) {

		String str = "123";
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			int charAt2 = charAt - '0';
			result = result * 10 + charAt2;
		}

		System.out.println(result);

	}
}
