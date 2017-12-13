package ds.linkedlist.singlelinklist;
import  ds.linkedlist.Node;

public class FindElement {

	static int elemToFind = 2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node p_node = new Node(1);
		p_node.next = new Node(2);
		p_node.next.next = new Node(3);
		p_node.next.next.next = new Node(4);

		findElem(p_node);

	}

	private static void findElem(Node p_node) {
		Node tempNode = p_node;
		while (tempNode != null) {
			if (elemToFind == tempNode.data) {
				System.out.println("Got data");
				return ;
			}
			tempNode = tempNode.next;
		}

		System.out.println("Element not present in the list !!! ");
	}

}
