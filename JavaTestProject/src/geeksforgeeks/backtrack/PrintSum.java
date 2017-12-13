package geeksforgeeks.backtrack;

//http://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/
public class PrintSum {

	private static int REQUIRED_SUM = 21;

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(8);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right = new Node(2);
		root.right.left = new Node(2);

		printPath(root, 0);

	}

	private static void printPath(Node node, int sum) {

		if (null == node) {
			return;
		}

		int lsum = sum + node.data;

		if (REQUIRED_SUM == lsum) {
			System.out.println("Got sum ");
			System.exit(0);
		}

		if (node.left == null && node.right == null) {
			System.out.println(lsum);
		} else {
			printPath(node.left, lsum);
			printPath(node.right, lsum);
		}
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right
				+ "]";
	}

}
