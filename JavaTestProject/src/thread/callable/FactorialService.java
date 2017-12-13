package thread.callable;

import java.util.concurrent.Callable;

public class FactorialService implements Callable<Long> {
	int i = 0;

	FactorialService(int i) {
		this.i = i;
	}

	@Override
	public Long call() throws Exception {
		return fact(i);
	}

	private long fact(int i) {
		if (i==0 || i == 1) {
			return 1;
		}
		return i * fact(i - 1);
	}

}
