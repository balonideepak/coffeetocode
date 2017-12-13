package ds;

public class HeightOfATree {
	private static Node root = null;
	private static int max = Integer.MIN_VALUE;
	int x;
	
	private void callme(){
		int x;
	}

	public static void main(String[] args) {
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		calculateHeightMethod1(root, "");
		int heightCalulatedByMethod2 = calculateHeightMethod2(root);
		System.out.println("Height by method 2 =>" + heightCalulatedByMethod2);
	}

	private static void calculateHeightMethod1(Node node, String path) {

		if (null == node) {
			return;
		}

		String l_path = node.data + " " + path;
		if (null == node.left && null == node.right) {

			if (l_path.split(" ").length > max) {
				max = l_path.split(" ").length;
				System.out.println("max height =" + max + " and path is =>"
						+ l_path);
			}

		} else {
			calculateHeightMethod1(node.left, l_path);
			calculateHeightMethod1(node.right, l_path);
		}
	}

	private static int calculateHeightMethod2(Node node) {

		if (null == node) {
			return 0;
		}

		int leftHeight = calculateHeightMethod2(node.left);
		int rightHeight = calculateHeightMethod2(node.right);

		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}

	}

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}
}
