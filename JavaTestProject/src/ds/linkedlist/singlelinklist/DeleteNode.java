package ds.linkedlist.singlelinklist;

import ds.linkedlist.Node;

/**
 *  Given only a pointer to a node to be deleted in a singly linked list, how do you delete it? 
 */
public class DeleteNode {

	public static void main(String[] args) {
		Node p_node = new Node(1);
		p_node.next = new Node(2);
		p_node.next.next = new Node(3);
		p_node.next.next.next = new Node(4);

		deleteNode(p_node.next.next);

		printList(p_node);
	}

	private static void printList(Node p_node) {

		Node tempNode = p_node;
		while (tempNode != null) {
			System.out.println(" Node data :: "+tempNode.data);
			tempNode = tempNode.next;
		}

	}

	private static void deleteNode(Node node_to_del) {
		Node tempNode = node_to_del.next;
		node_to_del.data=tempNode.data;
		node_to_del.next=tempNode.next;
	}

}
