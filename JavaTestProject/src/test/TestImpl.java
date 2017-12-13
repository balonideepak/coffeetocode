package test;

public class TestImpl  implements TestConnection{

	public TestConnection getConnection() {
		
		return new TestImpl();
	}

}
