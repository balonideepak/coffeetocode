package jmx;

public interface SystemConfigMBean {

	public void setThreadCount(int threadCount);
    public int getThreadCount();
    public void changeThreadCount(int threadCount);
    
}
