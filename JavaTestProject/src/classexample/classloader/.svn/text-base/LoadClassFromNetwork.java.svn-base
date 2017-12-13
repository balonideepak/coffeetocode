package classexample.classloader;

import java.net.URL;
import java.net.URLClassLoader;

public class LoadClassFromNetwork {

	/**
	 * @author deepak.baloni
	 * @param args
	 */
	public static void main(String argv[]) throws Exception {

		URLClassLoader loader = new URLClassLoader(
				new URL[] { new URL(
						"http://cvs.onmobile.com/cgi-bin/viewvc.cgi/MMP/master/base/dvlp/Packs%203.O/WebContent/WEB-INF/classes/com/?pathrev=MAIN/") });

		// Load class from class loader. 
		Class c = loader.loadClass("com.onmobile.packs3O.SMSDaemon.PackSMSDaemonCronSchedule");

		// Create an instance of the class just loaded
		Object o = c.newInstance();

	}

}
