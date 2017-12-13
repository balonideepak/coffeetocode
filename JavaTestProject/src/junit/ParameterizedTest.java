package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	int x;
	int y;

	public ParameterizedTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2 }, { 5, 3 }, { 10, 5 } };
		return Arrays.asList(data);

	}

	@Test
	public void testMultiply() {
		TestClass1 obj = new TestClass1();
		Assert.assertEquals("Result", x * y, obj.multiply(x, y));

	}
	
	

}
