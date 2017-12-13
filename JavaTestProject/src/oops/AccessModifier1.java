package oops;

public class AccessModifier1 extends Base {

	public static void main(String[] args) {
		Base obj = new AccessModifier1();
		obj.m1();
	}

	/*
	 * cannot reduce the visibility
	 *  private void m1() {
	 * System.out.println("Method m1 from child"); }
	 */

	// We can increase the visibility
	public void m1() {
		System.out.println("Method m1 from parent");
	}
}

class Base {
	void m1() {
		System.out.println("Method m1 from parent");
	}

	private void m2() {
		System.out.println("Method m2 from parent");
	}
}
