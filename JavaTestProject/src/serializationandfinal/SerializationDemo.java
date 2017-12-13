package serializationandfinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {

		SerializationChildClass obj1 = new SerializationChildClass();
		obj1.i = 10;
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(
				new File("test.ser")));

		oss.writeObject(obj1);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("test.ser")));
		SerializationSuperClass obj2 = (SerializationSuperClass) ois
				.readObject();
		
		System.out.println(obj2.i);

	}

}
