package thread.revision;

public class RunnableDemo implements Runnable {

	int i=10;
	
	@Override
	public void run() {
		System.out.println("Hello world from runnable . value of i="+i);
		i++;

	}

}
