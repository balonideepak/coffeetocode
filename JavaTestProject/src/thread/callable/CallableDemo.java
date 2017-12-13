package thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		Callable<Long> task;
		for (int i = 1; i < 100; i++) {
			task = new FactorialService(i);
			Future<Long> result = es.submit(task);
			while (!result.isDone()) {
				System.out.println("Task is not completed yet...");
				Thread.sleep(1000);

			}

			try {
				System.out.println("Factorial of " + i + " is " + result.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		es.shutdown();
	}

}
