package oops;

public class FinalMethodsOverriden extends Base {
	public static void main(String[] args) {
		Base obj = new FinalMethodsOverriden();
		obj.callMe();
	}

	void callMe() {
		System.out.println("");
	}

}

class Base {
	final void callMe() {
		System.out.println("");
	}
}
