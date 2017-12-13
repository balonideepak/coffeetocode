package testcase.ds.stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ds.stack.NextGreaterElement;

public class NextGreaterElementTest {
	@Test
	public void testWithAscOrder() {
		NextGreaterElement obj = new NextGreaterElement();
		obj.setCharInputArr(new char[] { '2', '3', '5', '6', '8' });
		obj.setNextGreaterElemOf('3');
		assertEquals('5', obj.findNextGreaterElem());
	}

	@Test
	public void testWithDescOrder() {
		NextGreaterElement obj = new NextGreaterElement();
		obj.setCharInputArr(new char[] { '5', '6', '4', '3', '1' });
		obj.setNextGreaterElemOf('4');
		char findNextGreaterElem = obj.findNextGreaterElem();
		assertEquals('0', findNextGreaterElem);
	}
	
	@Test
	public void testWithRandomOrder() {
		NextGreaterElement obj = new NextGreaterElement();
		obj.setCharInputArr(new char[] {  '9', '4', '8', '7' ,'6'});
		obj.setNextGreaterElemOf('4');
		char findNextGreaterElem = obj.findNextGreaterElem();
		assertEquals('8', findNextGreaterElem);
	}

}
