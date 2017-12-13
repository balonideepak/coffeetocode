package junit;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

@Ignore("Not ready to run")
@Test
public void testMultiply(){
	TestClass1 obj=new TestClass1();
	obj.multiply(0000000, 00000000);
	System.out.println("Method is not ready yet");
}

}
 