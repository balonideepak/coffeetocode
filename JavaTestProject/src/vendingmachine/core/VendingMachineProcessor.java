package vendingmachine.core;

import java.util.Scanner;

import vendingmachine.enums.BeverageType;
import vendingmachine.exception.NotSufficientFundException;

public class VendingMachineProcessor {

	public void vendingMachineOptions() {
		System.out.println("****************************************");
		System.out.println("Press 1 to get Coke , charge is 25 cents");
		System.out.println("Press 2 to get Pepsi , charge is 35 cents");
		System.out.println("Press 3 to get Soda , charge is 45 cents");
		System.out.println("Press 4 to exit");
	}

	public boolean deductAndCheck(Scanner in, BeverageType beverageType) {
		System.out.println("You have selected " + beverageType
				+ " please give the required cents");
		int cents = in.nextInt();
		int beverageCost = beverageType.getPrice();

		if (cents < beverageCost) {
			try {
				throw new NotSufficientFundException("Please give "
						+ beverageCost + " cents for  "
						+ beverageType.getName()
						+ " . Returning to the main menu");
			} catch (Exception e) {
				System.err.print(e.getMessage());
			}

			return false;
		}

		int remainingAmt = cents - beverageCost;
		if (cents >= beverageCost) {
			System.out
					.println("Please collect your drink , and balance left is :"
							+ remainingAmt);
			System.out.println("Please select more drinks if you want .");
			return true;
		}
		return false;
	}

}
