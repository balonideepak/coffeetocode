package junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleTest {

	@Rule
	public ExpectedException exception=ExpectedException.none();
	
	@Test
	public void testIllegalArgument(){
		exception.expect(IllegalArgumentException.class);
		//exception.expectMessage("Negative value not allowed");
		TestClass1 obj = new TestClass1();
		obj.multiply(-1, 2);
	}
	
}
