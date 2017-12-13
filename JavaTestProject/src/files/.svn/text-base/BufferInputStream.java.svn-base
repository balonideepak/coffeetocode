package files;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStream {
public static void main(String[] args) throws IOException {
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream(new File("d:\\test.txt")));
	int content;
//	while((content=bis.read())!=-1){
//		System.out.println((char)content);
//	}
	
	DataInputStream dis=new DataInputStream(bis);
	while(dis.available()!=0){
		System.out.println(dis.readLine());
	}
	
	
}
}
