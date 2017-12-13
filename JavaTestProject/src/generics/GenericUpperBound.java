package generics;

public class GenericUpperBound<T extends Comparable<T>> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		GenericUpperBound<String> type1 = new GenericUpperBound<>();
		type1.set("a");

		GenericUpperBound<String> type2 = new GenericUpperBound<>();
		type2.set(" b");

		System.out.println("Equals status =>" + type1.get().compareTo(type2.get()));

	}

}
