package ds.linkedlist.singlelinklist.geeksforgeeks;


class Node implements Cloneable {
	public String data;
	public Node next;
	public Node prev;

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

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", prev=" + prev + "]";
	}
	
	@Override
    public boolean equals(Object obj) {
        return (this.data == ((Node)obj).data);
    }
	
	
	
}
