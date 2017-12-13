public class XOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x1 = 1;
		int x2 = 1 ^ 2;

		System.out.println(x1 ^ x2);
		
		AbstractClass ab=new XOR().new AbstractClass() {
		};
		ab.callMe();

	}

	abstract class AbstractClass {
		public void callMe() {

		}
	}

}
