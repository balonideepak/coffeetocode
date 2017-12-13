package jmx;

public class SystemConfig implements SystemConfigMBean {
	private int threadCount;

	public SystemConfig(int threadCount) {
		this.threadCount = threadCount;
	}

	@Override
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}

	@Override
	public int getThreadCount() {
		return threadCount;
	}

	@Override
	public void changeThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}

}
