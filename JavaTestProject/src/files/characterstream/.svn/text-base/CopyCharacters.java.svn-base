package files.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
	public static void main(String[] args) throws IOException {

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("byte_stream_input.txt");
			outputStream = new FileWriter("byte_stream_output.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
		
		System.out.println("Done !!!");
	}
}
