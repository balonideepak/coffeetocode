package classexample.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class LoadClassFromJar {

	/**
	 * @author deepak.baloni
	 * @param args
	 * @throws MalformedURLException 
	 * @throws ClassNotFoundException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		URLClassLoader urlclassloader = new URLClassLoader(
				new URL[] { new URL(
						"file:////D:/Documents/Project-Documents/Emocion/DNCTO/dnctoService.jar") });
		Class<?> classname = urlclassloader.loadClass("com.onmobile.dnctoservice.plugin.util.DNCTODetail");
		Constructor<?> constructor = classname.getConstructor();
		Object obj = constructor.newInstance();
		System.out.println("classname ::"+classname+" , obj ::"+obj);
	}

}
