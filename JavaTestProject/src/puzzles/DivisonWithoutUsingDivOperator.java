/**
 * 
 */
package puzzles;

/**
 * @author deepak.baloni
 * 
 */
public class DivisonWithoutUsingDivOperator {

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 11:44:59 AM
	 */
	public static void main(String[] args) {

		int[] info1 = divMethod1(101, 5);
		System.out.println("Division by first Method :---> Quotient is :"+info1[0]+" and remainder is : "+info1[1]);
		
		
		int[] info2 = divMethod2(99, 5);
		System.out.println("Division by first Method :---> Quotient is :"+info2[0]+" and remainder is : "+info2[1]);
		
		
		
	}

	public static int[] divMethod1(int dividend, int divisor) {
		int[] info = new int[2];
		int quotient = 0;
		while (dividend >= divisor) {
			dividend = dividend - divisor;
			quotient++;
		}

		info[0] = quotient;
		info[1] = dividend;
		return info;
	}
	
	public static int[] divMethod2(int dividend, int divisor) {
		int[] info = new int[2];
		int quotient = 1;
		int remainder=0;
		while (dividend >= divisor*quotient) {
			remainder=dividend-divisor*quotient;
			quotient++;
			
			
			
		}

		info[0] = quotient-1;
		info[1] = remainder;
		return info;
	}
	
	
}
