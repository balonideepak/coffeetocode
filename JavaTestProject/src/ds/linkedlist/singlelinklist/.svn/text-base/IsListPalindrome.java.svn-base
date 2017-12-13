package ds.linkedlist.singlelinklist;

import java.util.Stack;

public class IsListPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node link = new Node("R");
		link.next = new Node("A");
		link.next.next = new Node("D");
		link.next.next.next = new Node("A");
		link.next.next.next.next = new Node("R");

		method1(link);

		
	}

	private static void method1(Node node) {

		Stack stack = new Stack();
		storeInStack(node,stack); 
		boolean isPalindrome = matchStackAndList(node, stack);
		if(isPalindrome){
			System.out.println("Is Palindrome....");
		}
		else{
			System.out.println("Not Palindrome....");
		}
	}

	private static void storeInStack(Node node, Stack stack) {
		Node temp = node;
		if (temp != null) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.next;
			}
		}
	}

	private static boolean matchStackAndList(Node pnode, Stack stack) {
		Node temp = pnode;
		if (temp != null) {
			while (temp != null) {
				Node node=(Node)stack.pop();
				if(!temp.data.equals(node.data)){
					return false;
				}
				
				temp = temp.next;
			}
		}
		return true;
	}

}

class Node implements Cloneable {
	public String data;
	public Node next;

	public Node(String data) {
		this.data = data;
	}

	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
