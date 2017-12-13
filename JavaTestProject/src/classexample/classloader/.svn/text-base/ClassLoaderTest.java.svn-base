package classexample.classloader;

import test.Test;

public class ClassLoaderTest {

	/**
	 * @author deepak.baloni
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();

		// printing ClassLoader of this class
		System.out.println("ClassLoaderTest.class.getClassLoader() : "
				+ ClassLoaderTest.class.getClassLoader());

		// trying to explicitly load this class again using Extension class
		// loader
		//  >>>>>  Class.forName("classexample.classloader", true, classLoader.getParent());
		//  >>>>>  	Class.forName("test.Test", true, classLoader.getParent());

	}

}
