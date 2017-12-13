package thread.revision;

public class ThreadCreation {

	public static void main(String[] args) {
		createFromClassExtendingThread();
		createFromClassImplementingRunnable();

	}

	
	private static void createFromClassExtendingThread() {
		Thread threadObj = new ThreadDemo();
		threadObj.start();
	}
	
	private static void createFromClassImplementingRunnable() {
		RunnableDemo target = new RunnableDemo();
		Thread threadObj=new Thread(target);
		threadObj.start();
		threadObj=new Thread(target);
		threadObj.start();
		
		
	}


}
