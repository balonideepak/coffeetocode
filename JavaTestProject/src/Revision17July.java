import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Revision17July {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// performRegex();
		performSeriaDeria();
	}

	private static void performRegex() {
		performOperations();
	}

	private static void performSeriaDeria() throws Exception {
		B b1 = new B(10, 20);
		B b2 = new B(20, 20);
		B b3 = new B(30, 20);
		B b4 = new B(40, 20);
		B b5 = new B(50, 20);
		List<B> list = new ArrayList<B>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);

		FileOutputStream fos = new FileOutputStream(new File("abc.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);

		FileInputStream fis = new FileInputStream(new File("abc.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);

		List<B> readObject = (List<B>) ois.readObject();
		System.out.println("i = " + readObject.get(3).i);
		System.out.println("j = " + readObject.get(3).i);

	}

	private static void performOperations() {

		String operation = null;
		while (true) {
			printOptions();

			operation = in.next();
			switch (operation) {
			case "1":
				singleCharacterMatch(in);
				break;
			case "2":
				System.err.print("Exiting...");
				System.exit(0);
			}
		}
	}

	private static void printOptions() {
		System.out.println("Please select from below operations .");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Press 1 for regex  match");
		System.out.println("2. Press 2 to exit");
	}

	private static void singleCharacterMatch(Scanner in) {
		System.out.println("Please provide the pattern");
		/** https://www.javatpoint.com/java-regex **/
		Pattern pattern = Pattern.compile(in.next());
		System.out.println("Please provide the string");
		Matcher matcher = pattern.matcher(in.next());
		boolean matches = matcher.matches();
		System.out.println("match found =" + matches);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		in.close();
	}
}
