package thread.revision.producerconsumer;

public class Consumer extends Thread {
	private Q q;
	public Consumer(Q q) {
		this.q=q;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			q.get();
		}
	}

}