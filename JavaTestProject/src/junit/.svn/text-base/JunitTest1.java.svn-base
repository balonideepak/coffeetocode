package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest1 {

	@BeforeClass
	public static void setup(){
		System.out.println("Setting the test class...");
	}
	
	
	@Before
	public void testsetup() {
		System.out.println("Calling before every method ...");
	}

	@Test
	public void testMultiply() {
		TestClass1 obj = new TestClass1();
		assertEquals("10 x 5 must be 50", 50, obj.multiply(10, 5));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowException(){
		TestClass1 obj=new TestClass1();
		obj.multiply(1001, 2);
	}

}
