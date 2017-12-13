package thread.syncronized;

public class SynchronizedTest2 {

	public static void main(String[] args) {
		Counter counterA = new Counter();
		Counter counterB = new Counter();
		
		Thread threadA = new CounterThread(counterA);
		Thread threadB = new CounterThread(counterB);

		threadA.start();
		threadB.start();
	}
}
