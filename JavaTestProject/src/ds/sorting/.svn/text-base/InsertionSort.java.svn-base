package ds.sorting;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayIns arrIns=new ArrayIns(6);
		arrIns.add(10);
		arrIns.add(1);
		arrIns.add(11);
		arrIns.add(20);
		arrIns.add(5);
		arrIns.add(30);
		
		System.out.println("Started Insertion sort .....");
		arrIns.sort();
		
		arrIns.display();
		System.out.println("Finished Insertion sort .....");
	}

}

class ArrayIns {

	int maxSize;
	int[] arr;
	int count=0;

	public ArrayIns(int maxSize) {
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
		int in;
		for(int out=1;out<maxSize;out++){
        
			int temp=arr[out];
			in=out;
			while(in>0 && arr[in-1]>=temp){
				
				arr[in]=arr[in-1];
				--in;
			}
			arr[in]=temp;
		}
	}

	
	
}
