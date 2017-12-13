package geeksforgeeks.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//http://www.geeksforgeeks.org/serialize-deserialize-binary-tree/
public class SerializeAndDeserializeTree {
	public static void main(String[] args) throws Exception {

		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);

		System.out.println("Inorder traversal before serialization .......");
		printInOrder(root);

		File file = new File("d:\\tree.txt");

		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);

		serialize(root, bw);
		bw.close();

		BufferedReader br = new BufferedReader(new FileReader(file));
		Node newNode = null;
		Node newRoot=null;
		deserialize(newRoot,newNode, br);

		System.out
				.println("\n Inorder traversal after de-serialization .......");
		printInOrder(newNode);
		br.close();

	}

	private static void printInOrder(Node node) {
		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.val + " ");
		printInOrder(node.right);
	}

	private static void serialize(Node node, BufferedWriter bw)
			throws Exception {

		if (node == null) {
			bw.write("-1\n");
			return;
		}

		bw.write(node.val + "\n");
		serialize(node.left, bw);
		serialize(node.right, bw);

	}

	private static Node deserialize(Node newRoot ,Node newNode, BufferedReader br)
			throws Exception {

		String val = br.readLine();
		if (val.equals("-1") || val.equals("")) {
			return new Node();
		}
		
		if(newRoot==null){
			newRoot=new Node(Integer.parseInt(val));
			newNode=newRoot;
		}
		
		newNode.left = deserialize(newRoot,newNode.left, br);
		newNode.right = deserialize(newRoot,newNode.right, br);

		return newRoot;

	}

	static class Node {
		int val;
		Node left;
		Node right;

		public Node() {
		}

		public Node(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return "Node [val=" + val + "]";
		}

	}
}
