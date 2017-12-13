import java.io.Serializable;

public class A implements Serializable {

	int i;

	public A() {
	}

	// parameterized constructor
	public A(int i) {
		this.i = i;
	}
}
