package ds.linkedlist.singlelinklist.merge;

public class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public void displayNode(){
		System.out.println("Data : "+this.data);
	}
	
}
