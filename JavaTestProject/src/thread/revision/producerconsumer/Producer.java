package thread.revision.producerconsumer;

public class Producer extends Thread {

	private Q q;
	public Producer(Q q) {
		this.q=q;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			q.put(i);
		}
	}

}
