package vendingmachine.testcases;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

import vendingmachine.core.VendingMachineProcessor;
import vendingmachine.enums.BeverageType;

public class VendingMachineTest {

	private static VendingMachineProcessor vmp = null;

	@BeforeClass
	public static void init() {
		vmp = new VendingMachineProcessor();
	}

	@Test
	public void testVendingMachineOptions() {
		BeverageType[] values = BeverageType.values();
		assertEquals(3, values.length);
	}

	@Test
	public void testVendingMachineOperationForCoke() throws IOException {

		ByteArrayInputStream in = new ByteArrayInputStream("25".getBytes());
		System.setIn(in);

		Scanner scanner = new Scanner(System.in);
		BeverageType beverageType = BeverageType.COKE;
		boolean result = vmp.deductAndCheck(scanner, beverageType);
		assertEquals(true, result);

		System.setIn(System.in);
	}
}
