import java.util.ArrayList;
import java.util.List;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);

		addStringToList(intList);

		for (Integer integer : intList) {
			System.out.println(integer);
		}
		
	}

	private static void addStringToList(List   intList) {
		intList.add("ABC");

	}

}
