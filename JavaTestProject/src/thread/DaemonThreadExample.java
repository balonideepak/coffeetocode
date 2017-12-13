package thread;

public class DaemonThreadExample {
	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					while (true) {
						System.out.println("Daemon thread is running...");
					}
				} finally {
					System.out.println("Finally block called...");
				}
			}
		});
		thread.setDaemon(true);
		thread.start();

	}
}
