package scjp.thread;

public class ThreadTest extends Thread {

	static String sName = "good";

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		ThreadTest t = new ThreadTest();
		t.nameTest(sName);
		System.out.println(sName);

	}

	public void nameTest(String sName) {
		sName = sName + " idea ";
		start();
		
		
	}

	public void run() {

		for (int i = 0; i < 4; i++) {
			sName = sName + " " + i;

		}
	}

}
