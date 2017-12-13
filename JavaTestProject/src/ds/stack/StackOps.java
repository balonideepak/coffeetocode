package ds.stack;

public class StackOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackX stackObj = new StackX(5);
		stackObj.push(1);
		stackObj.push(2);
		stackObj.push(3);
		stackObj.push(4);
		stackObj.push(5);

		System.out.println("Printing Stack elements .....");
		while (!stackObj.isEmpty()) {
			System.out.println(stackObj.pop());
		}

	}

}
