package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteAtTheEOF {

	public static void main(String arg[]){
		try {
			System.out.println("starting the process ...........");
			
			long startTime = System.currentTimeMillis();
			
			File file = new File("D:\\test.txt");
            RandomAccessFile raf=new RandomAccessFile(file, "rw");
            raf.seek(file.length());
            raf.writeBytes(System.getProperty("line.separator")+"Hello World---6");
            raf.writeBytes(System.getProperty("line.separator")+"\nHello World---7");
            
           long endTime= System.currentTimeMillis();
           System.out.println("Total time to write the contents is : "+(endTime-startTime)+"seconds");
           
           System.out.println("process complete !!!  ");
            
            
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
