package geeksforgeeks;

import java.util.Stack;

public class ReverseArray {

	private static int arr[] = { 1, 2, 3 };

	public static void main(String[] args) {

		stackApproach();

		swapApproach();

	}

	private static void stackApproach() {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i : arr) {
			stack.push(i);
		}

		System.out.println("Stack approach output....");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

	private static void swapApproach() {
		int temp = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.println("Swap approach output....");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
