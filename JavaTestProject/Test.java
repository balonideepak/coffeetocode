import java.io.File;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String str="hello"+File.separator+File.separator;
		str=str.replaceAll(File.separator+File.separator, File.separator);
		System.out.println(str);
		
	}

}
