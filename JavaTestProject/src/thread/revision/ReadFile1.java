package thread.revision;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile1 extends Thread {

	public static void main(String[] args) {
		ReadFile1 thread = new ReadFile1();
		thread.start();

	}

	@Override
	public void run() {
		try {
//			String line = null;
//			BufferedReader br = new BufferedReader(new FileReader(new File(
//					"d:/a.txt")));
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//				Thread.sleep(2000);
//			}
			
			BufferedWriter bw = null;
			while (true) {
				bw = new BufferedWriter(new FileWriter(new File("d:/b.txt"), true));
				bw.append("data from 1");
				Thread.sleep(1000);
				bw.close();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
