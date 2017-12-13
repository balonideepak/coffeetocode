/**
 * 
 */
package general;

/**
 * @author deepak.baloni
 * 
 */
public class MatrixMultiplication {

	int[][] a = { { 1, 2 }, { 3, 4 } };
	int[][] b = { { 0, 1 }, { 1, 3 } };
	int[][] c = new int[2][2];

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 6:09:06 PM
	 */
	public static void main(String[] args) {

		MatrixMultiplication obj = new MatrixMultiplication();
		obj.doMatrixMultiplication();
	}

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 6:11:20 PM
	 */
	private void doMatrixMultiplication() {
		// c[0][0] = 0;
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				for (int k = 0; k < 2; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.println(c[i][j]);
			}
		}

	}

}
