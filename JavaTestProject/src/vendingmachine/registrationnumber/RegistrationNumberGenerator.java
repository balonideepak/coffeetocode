package vendingmachine.registrationnumber;

import java.util.Scanner;

public class RegistrationNumberGenerator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String registrationNumberString = in.nextLine();
		String arr[] = registrationNumberString.split(",");

		String fullRegistrationNumber = arr[0].trim();
		int nthNumber = Integer.parseInt(arr[1].trim());

		String registrationNumber = fullRegistrationNumber.split(" ")[1];

		if ("KA51 ZZ9999".equals(fullRegistrationNumber)) {
			System.err.print("You have reached the max limit . Exiting ....");
			System.exit(0);
		}

		int number = Integer.parseInt(registrationNumber.substring(2));

		String firstPartString = "" + registrationNumber.charAt(0);
		String secondPartStr = "" + registrationNumber.charAt(1);
		String numberStrThirdPart = "" + number;
		String result = null;
		char charAtFirst = registrationNumber.charAt(0);
		char charAtSecond = registrationNumber.charAt(1);

		if (number + nthNumber > 9999) {
			int n = nthNumber - 1;
			numberStrThirdPart = "" + n;

			if (n < 10) {
				numberStrThirdPart = "000" + n;
			} else if (n > 10 && n < 100) {
				numberStrThirdPart = "00" + n;
			} else if (n > 100 && n < 1000) {
				numberStrThirdPart = "0" + n;
			}

			int intAtSecond = (int) registrationNumber.charAt(1) + 1;
			charAtSecond = (char) intAtSecond;

			int intAtFirst = (int) registrationNumber.charAt(0) + 1;
			charAtFirst = (char) intAtFirst;

			if (charAtSecond < 'Z') {
				result = firstPartString + charAtSecond + numberStrThirdPart;
			} else if (charAtFirst < 'Z') {
				result = charAtFirst + secondPartStr + numberStrThirdPart;
			}

		} else if (number + nthNumber < 9999) {
			numberStrThirdPart = "" + (number + nthNumber);
			result = "" + charAtFirst + "" + charAtSecond + numberStrThirdPart;
		}

		System.out.println(fullRegistrationNumber.split(" ")[0]+" "+result);

	}
}
