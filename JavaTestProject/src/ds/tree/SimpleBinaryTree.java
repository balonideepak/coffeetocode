package ds.tree;

public class SimpleBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BT bt = new BT();
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
		bt.insert(10);

		bt.inorder();

	}

}

class BT {

	private int data;
	private BT left;
	private BT right;
	private BT root;

	public BT() {
		root = null;
	}

	public BT(int data) {
		this.data = data;
	}

	public void insert(int data) {
		root = insert(root, data);
	}

	private BT insert(BT node, int data) {
		if (node == null) {
			node = new BT(data);
		} else {
			if (node.getRight() == null) {
				node.right = insert(node.right, data);
			} else {
				node.left = insert(node.left, data);
			}
		}

		return node;
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(BT r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BT getLeft() {
		return left;
	}

	public void setLeft(BT left) {
		this.left = left;
	}

	public BT getRight() {
		return right;
	}

	public void setRight(BT right) {
		this.right = right;
	}

}
