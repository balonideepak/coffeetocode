package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
	public static void main(String[] args) {
		String[] arr = new String[] { "One", "Two", "two" };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		Collections.sort(list);

		System.out.println(list);
	}
	
}
