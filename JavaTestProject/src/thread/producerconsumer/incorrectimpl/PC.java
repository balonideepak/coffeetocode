package thread.producerconsumer.incorrectimpl;

public class PC {
	public static void main(String[] args) {
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		System.out.println("Running producer-consumer");
	}
}
