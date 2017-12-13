package collections;

import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationExceptionExample {
	public static void main(String[] args) {
		String[] strarr={"a","b"};
		List myNewList = Arrays.asList(strarr);
		myNewList.add(new Long(15)); // add an element in the list.
		myNewList.remove(0); // remove element from the list at index 0.
	}
}
