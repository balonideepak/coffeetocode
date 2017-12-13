package geeksforgeeks.backtrack;

//http://www.geeksforgeeks.org/write-a-c-program-to-get-count-of-leaf-nodes-in-a-binary-tree/
public class CountLeafNodes {
	private static int counter = 0;

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(8);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right = new Node(2);
		root.right.left = new Node(2);

		printPath(root);
		System.out.println(counter);
	}

	private static void printPath(Node node) {

		if (null == node) {
			return;
		}

		if (node.left == null && node.right == null) {
			counter++;
		} else {
			printPath(node.left);
			printPath(node.right);
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
