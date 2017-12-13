package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		Example obj = new Example();
		Class cls = obj.getClass();
		Constructor constructor = cls.getConstructor();
		System.out.println("Constructor name=" + constructor.getName());

		Method[] methods = cls.getMethods();
		System.out.println("Printing methods names.....");
		for (Method method : methods) {
			System.out.println(method.getName());
		}

		Method method1 = cls.getMethod("callMeWithParams", int.class);
		method1.invoke(obj, 12);

		Class c = Class.forName("reflection.Example");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("message", null);
		m.setAccessible(true);
		m.invoke(o, null);

	}

}
