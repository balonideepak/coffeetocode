package quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class HelloWorldQuartzExample {

	/**
	 * @author deepak.baloni 
	 * @param args
	 * @throws SchedulerException 
	 */
	public static void main(String[] args) throws SchedulerException {

		Scheduler sd=new StdSchedulerFactory().getScheduler();
		JobDetail jobDetail=JobBuilder.newJob(HelloJob.class).withIdentity(HelloJob.class.getName()).build();
		Trigger trigger=TriggerBuilder.newTrigger().withIdentity(HelloJob.class.getName()).withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();
		
		sd.start();
		sd.scheduleJob(jobDetail, trigger);
		
	}

}
