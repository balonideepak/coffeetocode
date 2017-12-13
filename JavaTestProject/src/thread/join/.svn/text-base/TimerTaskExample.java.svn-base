package thread.join;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskExample {
	public static void main(String[] args) {

		TimerTask timertask = new TimerTaskExample().new MyTimerTask();
		Timer timer = new Timer();
		timer.schedule(timertask, 0, 1000);
	}

	class MyTimerTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("Timer task started at:" + new Date());
			completeTask();
			System.out.println("Timer task finished at:" + new Date());
		}
	}

	private void completeTask() {
		try {
			// assuming it takes 20 secs to complete the task
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
