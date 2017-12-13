import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String path = "C:" + File.separator + File.separator
				+ "system1/properties\\\\";
		String replaced = path.replaceAll("[" + File.separator + File.separator
				+ File.separator + File.separator + "]+",
				Matcher.quoteReplacement(File.separator));
		System.out.println(replaced);

		String relativePath = "ssss\\\\ssss//";
		relativePath = relativePath.replaceAll("[" + "\\\\" + "]+",
				Matcher.quoteReplacement(File.separator));

		String fileName = "D:\\Documents\\SOA\\ProcMon\\composites\\payloads.txt";
		String parent = new File(fileName).getParent();
		System.out.println(parent);
		
		
		File file = new File("C:\\insight_lczn_extract_dir1459931672163");
		deleteDir(file);

	}
	
	public static void deleteFile(File file) {
	    try{
	      if (file.isDirectory()) {
	        String[] children = file.list();
	        for (int i = 0; i < children.length; i++) {
	          deleteFile(new File(file, children[i]));
	        }
	      }
	      file.delete();
	    }
	    catch(Exception e){
	      throw new RuntimeException(e);
	    }
	  }
	
	
	private static void deleteDir(File dir) {
	    if (dir.isDirectory()) {
	      String[] children = dir.list();
	      for (int i = 0; i < children.length; i++) {
	        deleteDir(new File(dir, children[i]));
	      }
	    }
	    dir.delete();
	  }

	private static String createTempDir(String prefix) {
		File tmpFile = null;
		File tmpDir = null;
		String tmpDirName = null;
		try {
			tmpFile = File.createTempFile(prefix, null);
			tmpDir = new File(tmpFile.getParentFile(), prefix);
			tmpFile.delete();

			if (null != tmpDir) {
				tmpDir.mkdirs();
				tmpDirName = tmpDir.getAbsolutePath();
			}

			return tmpDirName;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
