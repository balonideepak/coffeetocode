package amazing;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GetDefaultGC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<GarbageCollectorMXBean> garbageCollectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();
		for (GarbageCollectorMXBean garbageCollectorMXBean : garbageCollectorMXBeans) {
			System.out.println(garbageCollectorMXBean.getName());
		}
		
	}

}
