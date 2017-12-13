package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		sum(ints);
	}

	private static void sum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}

		System.out.println(sum);

	}

	public static <T extends Number> void copy(List<T> dest, List<T> src) {
	}
}
