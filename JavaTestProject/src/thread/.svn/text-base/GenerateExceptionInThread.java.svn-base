package thread;

import java.lang.Thread.UncaughtExceptionHandler;

public class GenerateExceptionInThread {

	/**
	 * @author deepak.baloni 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread t=new Thread(new ThreadWorker(), "Thread1");
		t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t + " throws exception: " + e);
				
			}
		});
		
		t.start();
		t.join();
		
		System.out.println("Finished");
		
	}

}

class ThreadWorker implements Runnable{

	public void run() {
		int x=8/0;
	}}
