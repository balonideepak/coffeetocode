package classexample;

public class ObjectCreation {

	/**
	 * @author deepak.baloni
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectCreation.NestedClass nestedClassObj = new ObjectCreation.NestedClass();
		nestedClassObj.callMe();
		
		ObjectCreation.InnerClass innerClassObj =new ObjectCreation().new InnerClass();
		innerClassObj.callMe();
	}

	static class NestedClass {
		private void callMe() {
			System.out.println("NestedClass called");
		}
	}

	class InnerClass {
		private void callMe() {
			System.out.println("InnerClass called");
		}
	}

}
