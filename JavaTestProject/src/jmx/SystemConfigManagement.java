package jmx;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class SystemConfigManagement {

	public static void main(String[] args) throws MalformedObjectNameException,
			InstanceAlreadyExistsException, MBeanRegistrationException,
			NotCompliantMBeanException, InterruptedException {
		MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
		SystemConfigMBean systemconfig = new SystemConfig(5);
		ObjectName objname = new ObjectName("com.project.jmx:type=SystemConfig");
		mbeanServer.registerMBean(systemconfig, objname);
		int threadCount=-1;
		do {
			Thread.sleep(2000);
			threadCount=systemconfig.getThreadCount();
			System.out.println("Thread count " + threadCount);
		} while (threadCount != 0);

	}

}
