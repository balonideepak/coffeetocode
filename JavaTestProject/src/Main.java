public class Main {
	public static void main(String[] args) {
		// Must explicitly chose Method1 from Class1 or Class2
		System.out.println(Class1.Method1());
		System.out.println(Class2.Method1());

		callMe(new Object());
	}

	private static void callMe(String s) {
		System.out.println("String called");
	}

	private static void callMe(Object o) {
		System.out.println("Object called");
	}

	static class Class1 {
		public static int Method1() {
			return 0;
		}
	}

	static class Class2 extends Class1 {
		public static int Method1() {
			return 1;
		}

	}

}