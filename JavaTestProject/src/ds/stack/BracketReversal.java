package ds.stack;

public class BracketReversal {

	public static void main(String[] args) {
		// char inputArr[] = { '}', '{' };
		// char inputArr[] = { '{', '{','{' };
		// char inputArr[] = { '{', '{','{','{','}','}' };
		char inputArr[] = { '}', '{', '{', '}', '}', '{', '{', '{' };
		int length = inputArr.length;
		if (length % 2 != 0) {
			throw new RuntimeException(
					"input array doesn't contains even number of brackets");
		}
		int count = 0;
		for (int i = 0; i < length / 2; i++) {
			if (inputArr[i] != '{') {
				count++;
			}

			if (inputArr[length - i - 1] != '}') {
				count++;
			}
		}
		System.out.println("Total number of reversals =" + count);
	}

}
