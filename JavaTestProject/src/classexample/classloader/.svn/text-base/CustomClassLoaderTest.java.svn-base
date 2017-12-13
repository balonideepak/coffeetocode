package classexample.classloader;

import java.lang.reflect.Method;

	public class CustomClassLoaderTest {
		 
	     public static void main(String [] args) throws Exception{
	        CustomClassLoader test = new CustomClassLoader();
	        Class classname = test.loadClass("test.Test");
	        System.out.println(classname);
	        Method[] methods = classname.getMethods();
//	        for (Method method : methods) {
//				System.out.println(method);
//			}
	     }
}
