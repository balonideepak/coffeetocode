package date;

import java.util.Date;

public class CompareDates {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Date d1 = new Date();
		long secs = 2;
		System.out.println("Sleeping for " + secs + " seconds.....");
		Thread.sleep(2 * 1000);
		Date d2 = new Date();
		System.out.println(d1.compareTo(d2));
	}

}
