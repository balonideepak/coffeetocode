package thread;

import java.io.IOException;

import thread.revision.RunnableDemo;
import thread.revision.ThreadDemo;

public class ThreadStopUsingInterrupt {

	public static void main(String[] args) throws IOException {

//		RunnableDemo obj = new RunnableDemo();
//		Thread thread=new Thread(obj);
		
		ThreadDemo thread=new ThreadDemo();
		thread.start();
		System.out.println("Please press enter key to stop the thread");
		System.in.read();
		thread.interrupt();
		System.out.println("Thread stopped");
	}



}
