package vendingmachine.core;

import java.util.Scanner;

import vendingmachine.enums.BeverageType;

public class VendingMachine {
	private static VendingMachineProcessor vendingMCProcessor = new VendingMachineProcessor();

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (true) {
			vendingMCProcessor.vendingMachineOptions();
			performAction(in);
		}

	}

	private static void performAction(Scanner in) {
		int option = in.nextInt();

		switch (option) {
		case 1:
			vendingMCProcessor.deductAndCheck(in, BeverageType.COKE);
			break;
		case 2:
			vendingMCProcessor.deductAndCheck(in, BeverageType.PEPSI);
			break;
		case 3:
			vendingMCProcessor.deductAndCheck(in, BeverageType.SODA);
			break;
		case 4:
			in.close();
			System.exit(0);
		}
	}

}
