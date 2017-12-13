package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import bean.Person;

/**
 * @author deepak.baloni
 * 
 */
public class TestSerialization {

	static class Alpha {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestSerialization testObj = new TestSerialization();
		testObj.testSerialization();
	}

	private void testSerialization() {
		try {
			FileOutputStream fos = new FileOutputStream(new File("Output.txt"));
			ObjectOutputStream os = new ObjectOutputStream(fos);
			Person lPerson = new Person();
			lPerson.setAge(23);
			lPerson.setCity("New York");
			lPerson.setName("John Mathews");
			os.writeObject(lPerson);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
