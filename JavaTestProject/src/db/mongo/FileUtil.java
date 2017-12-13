package db.mongo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
	private static BufferedWriter bw = null;
	static {
		try {
			bw = new BufferedWriter(new FileWriter(new File("mongo.log"), true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void write(String message) {
		try {
			bw.write(System.lineSeparator());
			bw.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void closeResources() {
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
