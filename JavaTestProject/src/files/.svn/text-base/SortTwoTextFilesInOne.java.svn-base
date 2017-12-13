package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortTwoTextFilesInOne {
	public static void main(String[] args) throws FileNotFoundException {

		File file1 = new File("sorted_input1.txt");
		File file2 = new File("sorted_input2.txt");

		Scanner scanner1 = new Scanner(file1);
		Scanner scanner2 = new Scanner(file2);

		String line1 = scanner1.nextLine();
		String line2 = scanner2.nextLine();

		while (line1 != null || line2 != null) {

			if (line1 == null) {
				System.out.println("from file 2 >> " + line2);
				line2 = readLine(scanner2);
			} else if (line2 == null) {
				System.out.println("from file 1 >> " + line1);
				line1 = readLine(scanner1);
			} else if (line1.compareToIgnoreCase(line2) <= 0) {
				System.out.println("from file 1 >> " + line1);
				line1 = readLine(scanner1);
			} else {
				System.out.println("from file 2 >> " + line2);
				line2 = readLine(scanner2);
			}
		}
		
		scanner1.close();
		scanner2.close();

	}

	private static String readLine(Scanner reader) {

		if (reader.hasNext()) {
			return reader.nextLine();
		} else {
			return null;
		}
	}
}
