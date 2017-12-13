package classexample.anonymousinnerclass;

public class Bar extends Boo {
	Bar() {
	}

	Bar(String s) {
		super(s);
	}

	public static void main(String[] args) {
		new Bar().zoo();
	}

	private void zoo() {
		Boo f = new Bar() {
		};
	}

	public void method1(final int i) {

		final int k = 6;
		class MethodLocal {
			MethodLocal() {
				System.out.println(k + i);
			}
		}
	}
	

}
