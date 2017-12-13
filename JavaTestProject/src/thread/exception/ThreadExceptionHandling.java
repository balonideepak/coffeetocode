package thread.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadExceptionHandling {

	private static Logger logger = Logger
			.getLogger(ThreadExceptionHandling.class.getName());

	public static void main(String[] args) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				System.out.println("Running inside run method");
				throw new RuntimeException("Thrown exception ");
			}
		};

		Thread t = new Thread(task, "Thread1");
		t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				String errMessage = "[ERROR] :: Thread " + t.getName()
						+ " thrown error message=" + e.getMessage();
				System.out.println(errMessage);
				logger.severe(errMessage);
				logger.log(Level.SEVERE, errMessage);
				logger.logp(Level.SEVERE,
						ThreadExceptionHandling.class.getName(),
						"uncaughtException", errMessage);
			}
		});

		t.start();

	}
}
