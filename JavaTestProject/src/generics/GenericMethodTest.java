package generics;

public class GenericMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] intArr={1,2,3,4,5};
		printArray(intArr);
		
		String[] strArr={"a","b","c"};
		printArray(strArr);
		
		Double[]  doubleArr={1.1,1.2,1.3};
		printArray(doubleArr);
		
	}
	
	private static   <T> void printArray(T[] array){
		System.out.println("********  Printing array content **************");
		for (T t : array) {
			System.out.println(t);
		}
	}

}
