package ds.linkedlist.singlelinklist;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}

	public void insert(int data) {
		Link newlink = new Link(data);
		newlink.next = first;
		first = newlink;
	}

	public void delete() {
		if (null != first) {
			Link temp = first;
			first = first.next;
			System.out.println("Deleted :: " + temp.data);
		}
	}

	public void display() {
		Link clone = (Link) first.clone();
		while (clone != null) {
			System.out.println(clone.data);
			clone = clone.next;
		}
	}

	public Link find(int loc) {
		Link clone = (Link) first.clone();
		int count = 1;
		while (clone != null) {
			if (count == loc) {
				break;
			}
			count++;
			System.out.println("Got data ::" + clone.data + " for location ::"
					+ loc);
			clone = clone.next;
		}
		return clone;
	}

	public void reverse() {
		Link current = first;
		Link next=null;
		int initial=0;
		while(current!=null){
			first=current.next;
			if(initial==0){
				initial++;
			next=current.next;
			current=next.next;
			current.next=null;
			}
			else{
				next=current.next;
				current=next.next;
			}
			
		}
		
	}

	// private Link clonelink() {
	// int data=first.data;
	// Link next=first.next;
	// Link clonelink=new Link(data);
	// clonelink.next=next;
	// return clonelink;
	// }

}
