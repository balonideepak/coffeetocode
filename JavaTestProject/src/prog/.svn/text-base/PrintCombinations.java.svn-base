package prog;

public class PrintCombinations {
	  String[] strArr = { "a", "b" };
	

	public static void main(String[] args) {
		int combLength=3;
		String[] strArr1 = { "a", "b" };
		System.out.println("First Test");
		printAllCombinations(strArr1,combLength);
		
		String[] strArr2 = { "a", "b","c","d" };
		combLength=1;
		System.out.println("\n Second Test");
		printAllCombinations(strArr2,combLength);
	}

	private static void printAllCombinations(String[] strArr, int combLength) {
		int arrLength=strArr.length;
		printAllCombinationsRec(strArr,"",arrLength,combLength) ;
	}
	
	private static void printAllCombinationsRec(String[] strArr, String prefix,int n,int k) {
		int arrLength = strArr.length;
		
		if(k==0){
			System.out.println(prefix);
			return;
		}
		
		for(int i=0;i<arrLength;i++){
			String newprefix=prefix+strArr[i];
			printAllCombinationsRec(strArr,newprefix,arrLength,k-1);
		}
		
	}
	
}
