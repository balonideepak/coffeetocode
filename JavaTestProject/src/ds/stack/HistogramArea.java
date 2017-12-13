package ds.stack;

public class HistogramArea {
	private static int inputArr[] = { 6, 2, 5, 4, 5, 2, 6 };

	public static void main(String[] args) {
		StackX<Integer> stack1 = new StackX<Integer>(inputArr.length);
		StackX<Integer> stack2 = new StackX<Integer>(inputArr.length);
		int maxSum = 0;
		int tempsum = 0;
		int min=0;
		boolean firstTime=false;
		for (int i : inputArr) {
			tempsum=0;
			boolean firstTime1=false;
			int counter=0;
			stack1.push(i);
			while (!stack1.isEmpty()) {
				Integer pop = stack1.pop();
				if(!firstTime1){
					firstTime1=true;
					min=pop;
				}
				if (pop<=min) {
					min=pop;
				} 
				counter++;
				stack2.push(pop);
			}

			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}

			tempsum=counter*min;
			
			if(!firstTime){
				maxSum=tempsum;
				firstTime=true;
			}
			
			if (tempsum > maxSum ) {
				maxSum = tempsum;
			}

		}

		System.out.println(maxSum);
	}

}
