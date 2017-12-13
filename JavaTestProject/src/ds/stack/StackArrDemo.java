package ds.stack;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StackArrDemo {

	private static int elem_arr[];
	private static int top = -1;
	private static int size = 0;

	public static void main(String[] args) {

		System.out.println("Please provide the stack size");
		System.out.println(" *****************************  ");
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		elem_arr = new int[size];

		char ch = 0;
		do {
			printStackOptions();

			int choice = in.nextInt();
			switch (choice) {
			case 1:
				try {
					System.out.println("Enter integer to be pushed");
					push(in.nextInt());
				} catch (Exception e) {
					System.out.println("Error =" + e.getMessage());
				}
				break;

			case 2:
				try {
					System.out.println("Popped element = " + pop());
				} catch (Exception e) {
					System.out.println("Error =" + e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Peeked element =" + peek());
				} catch (Exception e) {
					System.out.println("Error =" + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty status = " + isEmpty());
				break;
			case 5:
				System.out.println("Size of stack =" + size());
				break;

			case 6:
				try {
					displayStackElems();
				} catch (Exception e) {
					System.out.println("Error =" + e.getMessage());
				}
				break;

			default:
				System.out.println("Wrong option provided ");
				break;
			}

			System.out.println("Do you wish to continue . Type y or n .");
			ch = in.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

		in.close();

	}

	private static void push(int elem) {
		if (top + 1 >= size) {
			throw new IndexOutOfBoundsException("Overflow exception");
		}
		if (top + 1 < size) {
			elem_arr[++top] = elem;
		}
	}

	private static int pop() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return elem_arr[top--];
	}

	private static boolean isEmpty() {
		return top == -1;
	}

	private static int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return elem_arr[top];
	}

	private static int size() {
		return top + 1;
	}

	private static void displayStackElems() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");

		for (int i = 0; i < top + 1; i++) {
			System.out.println(elem_arr[i]);
		}
	}

	private static void printStackOptions() {
		System.out.println(" Please select stack operation : ");
		System.out.println(" *****************************  ");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. isEmpty");
		System.out.println("5. Size");
		System.out.println("6. Diaplay stack elements");

	}

}
