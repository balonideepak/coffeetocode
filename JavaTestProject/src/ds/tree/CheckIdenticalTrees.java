package ds.tree;

public class CheckIdenticalTrees {
	private static _TreeNode firstTreeRootNode = null;
	private static _TreeNode secondTreeRootNode = null;

	public static void main(String[] args) {
		firstTreeRootNode = new _TreeNode(10);
		insert(firstTreeRootNode, 5);
		insert(firstTreeRootNode, 11);
		insert(firstTreeRootNode, 2);
		insert(firstTreeRootNode, 1);
		insert(firstTreeRootNode, 25);

		secondTreeRootNode = new _TreeNode(10);
		insert(secondTreeRootNode, 5);
		insert(secondTreeRootNode, 11);
		insert(secondTreeRootNode, 2);
		insert(secondTreeRootNode, 1);
		insert(secondTreeRootNode, 22);

		// printInOrder(firstTreeRootNode);

		checkIfIdentical(firstTreeRootNode, secondTreeRootNode);
	}

	private static void insert(_TreeNode node, int data) {
		if (data < node.data) {
			if (node.left == null) {
				node.left = new _TreeNode(data);
			} else {
				insert(node.left, data);
			}
		} else if (data > node.data) {
			if (node.right == null) {
				node.right = new _TreeNode(data);
			} else {
				insert(node.right, data);
			}
		}
	}

	private static void printInOrder(_TreeNode node) {
		if (null == node) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.data + " , ");
		printInOrder(node.right);
	}

	private static void checkIfIdentical(_TreeNode firstTreeNode,
			_TreeNode secondTreeNode) {

		if (null == firstTreeNode || null == secondTreeNode) {
			return;
		}

		if (firstTreeNode.data != secondTreeNode.data) {
			System.out.println("Not identical");
		}

		checkIfIdentical(firstTreeNode.left, secondTreeNode.left);
		checkIfIdentical(firstTreeNode.right, secondTreeNode.right);

	}
}

class _TreeNode {
	int data;
	_TreeNode left;
	_TreeNode right;

	public _TreeNode(int data) {
		this.data = data;
	}

}
