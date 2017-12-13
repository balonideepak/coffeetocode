/**
 * 
 */
package general;

/**
 * @author deepak.baloni
 * 
 */
public class DeleteCharacters {

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 12:11:46 PM
	 */
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		String a = "abcdefga1234567d";
		String b = "ad";
		String subStr = "";
		for (int i = 0; i < b.length(); i++) {
			int index = -1;
			while (-1 != a.indexOf(b.charAt(i))) {
				index = a.indexOf(b.charAt(i));
				a = subStr + a.substring(0, index)
						+ a.substring(index + 1, a.length());
			}
		}
		System.out.println("Output is : " + a);
		System.out.println("Time taken is "
				+ (System.currentTimeMillis() - currentTimeMillis));

	}
}
