package ds.sorting;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArraySel arrSel=new ArraySel(6);
		arrSel.add(10);
		arrSel.add(1);
		arrSel.add(11);
		arrSel.add(20);
		arrSel.add(5);
		arrSel.add(30);
		
		System.out.println("Started selection sort .....");
		arrSel.sort();
		
		arrSel.display();
		System.out.println("Finished selection sort .....");
	}

}

class ArraySel {

	int maxSize;
	int[] arr;
	int count=0;

	public ArraySel(int maxSize) {
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
		int min;
		for(int i=0;i<maxSize;i++){
			min=i;
			for(int j=i+1;j<maxSize;j++){
				if(arr[j] < arr[min]){
					min=j;
				}
			}
			swap(i , min);
		}
	}

	private void swap(int one, int two) {
		int temp=arr[two];
		arr[two]=arr[one];
		arr[one]=temp;
	}
	
}
