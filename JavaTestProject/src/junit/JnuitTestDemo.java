package junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;


public class JnuitTestDemo extends TestCase{

	@BeforeClass
	public  void setUp(){
		System.out.println("Set up");
	}
	
	@Test
	public void testMultiply(){
		System.out.println("call me");
		TestClass testObj=new TestClass();
		assertEquals("10 x 5 must be 50", 50, testObj.multiply(10, 5));
	}
	
	
	
	@Test
	public void testPrivateMethod() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		System.out.println("call me");
		TestClass testObj=new TestClass();
		Method method = TestClass.class.getDeclaredMethod("invokePrivateMethod", null);
		method.setAccessible(true);
		method.invoke(testObj,null);
	}
	
}
