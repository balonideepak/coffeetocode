/**
 * 
 */
package puzzles;

/**
 * @author deepak.baloni
 * 
 */
public class ExpressionSolver {

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 4:42:33 PM
	 */
	public static void main(String[] args) {
		ExpressionSolver obj = new ExpressionSolver();
		obj.solveExpression();

	}

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 4:43:06 PM
	 */
	private void solveExpression() {
		String expr = "3+5*(4-2)";

		for (int i = 0; i < expr.length(); i++) {
			expr.charAt(i);
		}

	}

}
