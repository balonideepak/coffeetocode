package ds.sorting;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayBub arrBub=new ArrayBub(6);
		arrBub.add(10);
		arrBub.add(1);
		arrBub.add(11);
		arrBub.add(20);
		arrBub.add(5);
		arrBub.add(30);
		
		arrBub.sort();
		
		System.out.println("Displaying result after sorting.....");
		arrBub.display();
		
	}

}

class ArrayBub {

	int maxSize;
	int[] arr;
	int count=0;

	public ArrayBub(int maxSize) {
		this.maxSize = maxSize;
		arr=new int[maxSize];
	}

	void add(int data){
		arr[count++]=data;
	}
	
	
	void display(){
		for(int i=0;i<maxSize;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	void sort(){
		for(int i=maxSize-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					swap(j , j+1);
				}
			}
		}
	}

	private void swap(int one, int two) {
		int temp=arr[two];
		arr[two]=arr[one];
		arr[one]=temp;
	}
	
}
