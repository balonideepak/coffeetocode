package ds.linkedlist;


/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class SumLL {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		int carry = 0;
		int tempSum = 0;

		ListNode result = null;

		int list1Size=size(temp1);
		int list2Size=size(temp2);
		
		int diff=list1Size-list2Size;
		
		ListNode biggerList=diff >0 ? temp1: temp2;

		for(int i=0;i<Math.abs(diff);i++){
			System.out.println(biggerList.val);
			biggerList=biggerList.next;	
		}
		
		
		while (temp1 != null) {

			if (carry == 1) {
				tempSum = temp1.val + temp2.val + 1;
				carry = 0;
			} else {
				tempSum = temp1.val + temp2.val;
			}
			if (tempSum > 9) {
				carry = 1;
			}
			if (result == null) {
				result = new ListNode(tempSum);
			} else {
				ListNode temp=result;
				ListNode tempPrev=null;
		        while(temp!=null){
		           tempPrev=temp;
		        	temp=temp.next;
		        }
		        tempPrev.next = new ListNode(tempSum);		        
				
			}

			temp1 = temp1.next;
			temp2 = temp2.next;

		}

		return result;
	}

	

	public static void main(String arg[]) {
		//2 -> 4 -> 3
		//5 -> 1 -> 5
		ListNode l1 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		l1.next = l12;

		ListNode l13 = new ListNode(3);
		l12.next = l13;

		ListNode l2 = new ListNode(5);
		
//		ListNode l22 = new ListNode(1);
//		l2.next = l22;
//
//		ListNode l23 = new ListNode(3);
//		l22.next = l23;


		SumLL OBJECT = new SumLL();
		ListNode result=OBJECT.addTwoNumbers(l1, l2);
		print(result);

	}
	
	private static int size(ListNode list){
        int count=0;
        ListNode temp=list;
        while(temp!=null){
        	temp=temp.next;
        	count++;
        }
        return count;
    }
	
	
	private static void  print(ListNode list){
        int count=0;
        ListNode temp=list;
        while(temp!=null){
           System.out.println(temp.val);
        	temp=temp.next;
        }
    }
}

class ListNode {
	int val;
	ListNode next;

	public ListNode() {
	}
	
	ListNode(int x) {
		val = x;
	}
	
	@Override
	public String toString() {
		return ""+val;
	}
}
