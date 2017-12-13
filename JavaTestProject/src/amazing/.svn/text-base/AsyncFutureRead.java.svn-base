package amazing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.Future;

import org.apache.poi.xslf.model.geom.Path;

public class AsyncFutureRead {

public static void main(String[] args) {

//Buffer to read the contents from the file.
ByteBuffer buffer = ByteBuffer.allocate(100);

//The file to read the contents from.
Path path = Paths.get("D:/tests/test.txt"); 

//Creating the asynchronous channel to the file which allows reading and writing of content.
try{
	AsynchronousFileChannel asyncChannel = AsynchronousFileChannel.open(path);
	


//Returns a Future instance which can be used to read the contents of the file.
Future fileResult = asyncChannel.read(buffer, 0);

//Waiting for the file reading to complete.
while(!fileResult.isDone()){
System.out.println("Waiting to complete the file reading ...");
}

//Print the number of bytes read.
System.out.println("Number of bytes read: "+fileResult.get());

//Reset the current position of the buffer to the beginning and the limit to the current position.
buffer.flip();

//Decode the contents of the byte buffer. 
System.out.println("Contents of file: ");
System.out.println(Charset.defaultCharset().decode(buffer));

}catch(Exception ex){
ex.printStackTrace();
} 
}
}

