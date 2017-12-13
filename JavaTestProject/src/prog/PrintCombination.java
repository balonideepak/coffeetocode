package prog;

public class PrintCombination {

	/**
	 * @author deepak.baloni 
	 * @param args
	 */
	public static void main(String[] args) {
    int[] arr={1,2,3,4};
    int k=3;
    printAllCombination(arr,k);
	}

	private static void printAllCombination(int[] arr, int k) {
		int arrlength=arr.length;
		printAllCombinationRec(arr,"",arrlength,k);
		
	}

	private static void printAllCombinationRec(int[] arr, String string,	int arrlength, int k) {
		
		
	}

}
