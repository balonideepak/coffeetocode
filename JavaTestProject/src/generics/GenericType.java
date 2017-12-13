package generics;

public class GenericType<T> {

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericType<String> type1 = new GenericType<>();
		type1.set("Hello");
		System.out.println(type1.get());

		GenericType<Integer> type2 = new GenericType<>();
		type2.set(2);
		System.out.println(type2.get());

	}

}
