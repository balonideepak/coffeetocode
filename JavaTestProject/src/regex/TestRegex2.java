package regex;

public class TestRegex2 {

	public static void main(String[] args) {
		String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";
		System.out.println(EXAMPLE_TEST.matches("\\w.*"));

		String[] strArr = EXAMPLE_TEST.split("\\s+");
		for (String string : strArr) {
			System.out.println(string);
		}

	}

}
