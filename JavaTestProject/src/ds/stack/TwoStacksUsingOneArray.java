package ds.stack;

public class TwoStacksUsingOneArray {
	int[] stackarr = {};

	public static void main(String[] args) {
		new TwoStacksUsingOneArray().createTwoStackUsingAnArray();

	}

	private void createTwoStackUsingAnArray() {
		Stack stack = new Stack(5);
		stack.push1(12);
		stack.push1(13);
		stack.push2(15);
		stack.push2(16);
		stack.pop1();
		stack.pop1();
		stack.pop2();
		stack.pop2();
	}

	class Stack {
		int size = -1;
		int start = -1;
		int end = -1;
		int forwardTobackwardPointer = -1;
		int backwardToForwardPointer = -1;

		public Stack(int size) {
			stackarr = new int[size];
			this.size = size;
			this.start = 0;
			this.end = size;
			forwardTobackwardPointer = -1;
			backwardToForwardPointer = size;
		}

		void push1(int data) {
			stackarr[++forwardTobackwardPointer] = data;
		}

		public void pop1() {
			System.out.println("Element popped from the first stack "
					+ stackarr[forwardTobackwardPointer--]);
		}

		void push2(int data) {
			stackarr[--backwardToForwardPointer] = data;
		}

		public void pop2() {
			System.out.println("Element popped from the second stack "
					+ stackarr[backwardToForwardPointer++]);
		}

	}

}
