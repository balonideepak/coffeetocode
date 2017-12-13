package ds;

import java.util.Stack;

/**
 * @author deepak.baloni
 * 
 */
public class CreatePostFixExpression {
	static Stack values = new Stack();

	// ------ +
	// ---*---------*
	// 2----3------4------5
	public static void main(String[] args) {
		Node node = new Node("+");
		node.left = new Node("*");
		node.right = new Node("*");
		node.left.left = new Node("2");
		node.left.right = new Node("3");
		node.right.left = new Node("4");
		node.right.right = new Node("5");

		postOrder(node);
		System.out.println("Final Value is " + values);

	}

	private static void postOrder(Node root) {

		if (null != root) {
			//if(!root.isVisited)
			postOrder(root.left);
			//if(!root.isVisited)
			postOrder(root.right);
			
			if ("+".equals(root.string)) {
				//values.pop();
				Integer value = Integer.parseInt((String) values.pop())
						+ Integer.parseInt((String) values.pop());
				String string = value.toString();
				values.add(string);
				root.isVisited=true;
				System.out.println("After Addition " + string);
			} else if ("*".equals(root.string)) {
				//values.pop();
				Integer value = Integer.parseInt((String) values.pop())
						* Integer.parseInt((String) values.pop());
				String string = value.toString();
				values.add(string);
				root.isVisited=true;
				System.out.println("After Mul " + string);

			}
			else{
				values.add(root.string);
				root.isVisited=true;
			}
		}
	
	}

	public static class Node {
		Node left;
		Node right;
		String string;
		boolean isVisited=false;

		/**
		 * @param string
		 */
		public Node(String string) {
			this.string = string;
		}

	}

}
