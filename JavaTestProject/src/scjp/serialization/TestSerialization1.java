package scjp.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization1 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"datafile"));
		B obj = new B();
		System.out.println(obj.hashCode());
		oos.writeObject(obj);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"datafile"));
		B b = (B) ois.readObject();
		System.out.println(b.hashCode());

		System.out.println(obj == b);

	}

}
