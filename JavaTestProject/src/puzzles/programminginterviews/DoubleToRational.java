package puzzles.programminginterviews;

public class DoubleToRational {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(getRational(0.125));
		System.out.println(getRational(-0.125));
		System.out.println(getRational(12.5));
		System.out.println(getRational(08.9));
	}

	private static String getRational(double d) {

		int tenpoly = 1;
		while (d * tenpoly - (int)( d * tenpoly) != 0) {
			tenpoly *= 10;
		}

		int divident = (int) (d * tenpoly);
		int divisor = tenpoly;

		int gcd = 0;
		if (divident > divisor) {
			gcd = getGCD(divident, divisor);
		} else {
			gcd = getGCD(divisor, divident);
		}

		divident /= gcd;
		divisor /= gcd;

		String output = d+"=" ;
		output += divident + "/" + divisor;

		return output;

	}

	private static int getGCD(int a, int b) {

		int remainder = a % b;
		if (remainder == 0) {
			return b;
		} else {
			return getGCD(b, remainder);
		}
	}

}
