package junit.java2s;

import java.util.List;

import junit.JunitTest1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerExample {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitTest1.class);
		List<Failure> failures = result.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}

}
