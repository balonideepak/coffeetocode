package puzzles;

import java.io.File;

public class CountTextFiles {

	/**
	 * @author deepak.baloni
	 * @param args
	 */
	public static void main(String[] args) {

		checkIsTextFile("D:/logs");//pass directory

	}

	private static void checkIsTextFile(String filename) {
		File filedir = new File(filename);
		System.out.println("[Info]::  checking for dir ::"+filename);
		
		String name = null;
		String ext = null;
		if (filedir.isDirectory()) {
			File[] listFiles = filedir.listFiles();
			for (File file : listFiles) {

				if (file.isDirectory()) {
					checkIsTextFile(file.getAbsolutePath());
				} else {
					name = file.getName();
					int lastIndexOf = name.lastIndexOf(".");
					ext = name.substring(lastIndexOf+1, name.length());
					if ("txt".equals(ext)) {
						System.out.println("[Message]:: Got text file ::" + name);
					}
				}
			}
		}
		else{
			System.out.println("[Error]:: No directory found . Its a file . Not checking its type.");
		}
	}

}
