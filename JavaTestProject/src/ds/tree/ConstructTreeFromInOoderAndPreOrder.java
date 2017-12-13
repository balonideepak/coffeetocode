package ds.tree;

public class ConstructTreeFromInOoderAndPreOrder {
	// http://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/

	private static char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
	private static char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
	private static int index = 0;

	public static void main(String[] args) {

		TNode root = buildTree(0, pre.length - 1);

		printInOrder(root);
	}

	private static TNode buildTree(int start, int end) {

		if (start > end)
			return null;

		char val = pre[index++];
		TNode node = new TNode(val);

		if (start == end) {
			return node;
		}

		int l_index = search(val);

		node.left = buildTree(start, l_index - 1);
		node.right = buildTree(l_index + 1, end);
		return node;

	}

	private static int search(char val) {
		for (int i = 0; i < in.length; i++) {
			if (val == in[i]) {
				return i;
			}
		}
		return -1;
	}

	private static void printInOrder(TNode node) {
		if (node == null)
			return;

		printInOrder(node.left);
		System.out.print(node.val + " ");
		printInOrder(node.right);
	}

}

class TNode {
	TNode left;
	TNode right;
	char val;

	public TNode(char val) {
		this.val = val;
	}

}
