/**
 * 
 */
package puzzles.programminginterviews;

/**
 * @author deepak.baloni
 * 
 */
public class SquareRoot {

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 1:19:24 PM
	 */
	public static void main(String[] args) {

		System.out.println("  Square root of the number is :" + squareRoot(9));

	}

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : String
	 * @Created Time : 1:23:36 PM
	 */
	private static double squareRoot(int i) {

		if (i < 0) {
			return -1;
		}

		if (i == 0 || i == 1) {
			return i;
		}

		double precision = 0.00001;
		double start = 0;
		double end = i;

		if (i < 1) {
			end = 1;
		}

		while (end - start > precision) {
			double mid = (start + end) / 2;
			double midsqr = mid * mid;

			if (midsqr == i) {
				return mid;
			}
			else if(midsqr > i){end=mid;}
			else start=mid;			
		}
		
		return (start+end)/2;

	}

}
