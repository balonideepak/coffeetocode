package ds.linkedlist.singlelinklist;

public class LinkListApp {
	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insert(20);
		theList.insert(30);
		theList.insert(40);
		theList.insert(50);
		theList.insert(60);
		
		System.out.println("Displaying elements >>>>  ");
		theList.display();
		System.out.println("Displaying elements finished >>>>  ");
		
		//theList.delete();
		//theList.delete();
		
		
		//System.out.println("After delete operation displaying elements >>>>  ");
		//theList.display();
		
		//theList.find(2);
		
		theList.reverse();
		
		
	}
}
