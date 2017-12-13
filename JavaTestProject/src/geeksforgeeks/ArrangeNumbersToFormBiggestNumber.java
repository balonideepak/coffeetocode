package geeksforgeeks;

//http://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/

//Solution :>>>> http://code.geeksforgeeks.org/ZwSK8r
import java.util.Arrays;
import java.util.Comparator;

public class ArrangeNumbersToFormBiggestNumber {

	public static void main(String[] args) {
		String[] arr = new String[] { "1", "34", "3", "98", "9", "76", "45",
				"4" };
		printBiggestNumber(arr);
	}

	private static void printBiggestNumber(String[] arr) {
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				String s1 = a + b;
				String s2 = b + a;
				System.out.println("a=" + a + " , b=" + b);
				return s2.compareTo(s1);
			}
		});

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
