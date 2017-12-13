package thread.revision.producerconsumer;

public class Q {
	private int i;
	private boolean setVal = true;

	public synchronized void put(int i) {
		if (setVal) {
			this.i = i;
			System.out.println("put :: " + i);
			setVal = false;
			notify();
		}

		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public synchronized void get() {
		if (!setVal) {
			System.out.println("Got :: "+i);
			notify();
			setVal = true;
		}

		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
