package ds.linkedlist.singlelinklist.NthNode;

public class GetNthNodeData {

	private static int index=2;
	private static Integer listData[] =new Integer[]{10,20,30,40,50};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GetNthNodeData oGetNthNodeData=new GetNthNodeData();
		Node<Integer> head = oGetNthNodeData.prepareLinkList(listData);
		int counter=0;
		Node<Integer> tempNode=head;
		while(tempNode!=null){
			if(counter==index){
				System.out.println("Got data :"+tempNode.data+" for index :"+index);
				break;
			}
			tempNode=tempNode.next;
		counter++;	
		}
		
	}

	private  Node<Integer>  prepareLinkList(Integer...  arg){
		Node<Integer> head=new Node<Integer>(arg[0]);
		Node<Integer> previous=head;
		for(int i=1;i<arg.length;i++){
			Node<Integer> tempNode=new Node<Integer>(arg[i]);
			previous.next=tempNode;
			previous=tempNode;
		}
		return head;
	}
}
