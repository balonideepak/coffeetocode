
public class RemoveString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str="alphabeta;alpha;beta;gamma;theta;alphabeta;";
		String elementToRemove="alpha;";
		int indexOf = str.indexOf(elementToRemove);
		String result=str.substring(0, indexOf) + str.substring(indexOf+elementToRemove.length(), str.length());
		System.out.println(result);
		
		String result2=str.replaceFirst(elementToRemove, "");
		System.out.println(result2);
	}

}
