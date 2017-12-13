package geeksforgeeks.medium;

public class AddingPolynomialsSolution {
	public static void main(String[] args) {

		Node node1 = new Node(5, 2);
		node1.next = new Node(4, 1);
		node1.next.next = new Node(2, 0);

		Node node2 = new Node(5, 1);
		node2.next = new Node(5, 0);

		Node result = addTwoPolynomials(node1, node2);

		while (result != null) {
			System.out.println("coefficient=>" + result.coefficient
					+ " , power=>" + result.power);
			result = result.next;
		}

	}

	private static Node addTwoPolynomials(Node node1, Node node2) {

		Node output = new Node();
		Node result = output;
		Node lNode1 = node1;
		Node lNode2 = node2;

		while (lNode1 != null && lNode2 != null) {

			if (lNode1.power > lNode2.power) {
				output.power = lNode1.power;
				output.coefficient = lNode1.coefficient;
				lNode1 = lNode1.next;
			} else if (lNode2.power > lNode1.power) {
				output.power = lNode2.power;
				output.coefficient = lNode2.coefficient;
				lNode1 = lNode2.next;
			} else {
				output.power = lNode1.power;
				output.coefficient = lNode2.coefficient + lNode1.coefficient;
				lNode1 = lNode1.next;
				lNode2 = lNode2.next;
			}
			output.next = new Node();
			output = output.next;

		}

		while (lNode1 != null || lNode2 != null) {

			if (lNode1 != null) {
				output.power = lNode1.power;
				output.coefficient = lNode1.coefficient;
				lNode1 = lNode1.next;
			}

			if (lNode2.next != null) {
				output.power = lNode2.power;
				output.coefficient = lNode2.coefficient;
				lNode1 = lNode2.next;
			}
			output.next = new Node();
			output = output.next;

		}

		
		return result;

	}

	private static class Node {

		Node next;
		int power;
		int coefficient;

		public Node() {
		}

		public Node(int coefficient, int power) {
			this.power = power;
			this.coefficient = coefficient;
		}

		@Override
		public String toString() {
			return "Node [ power=" + power + ", coefficient=" + coefficient
					+ "]";
		}

	}
}
