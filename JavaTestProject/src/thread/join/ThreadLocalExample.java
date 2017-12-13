package thread.join;

import java.text.SimpleDateFormat;

public class ThreadLocalExample implements Runnable{

	ThreadLocal<SimpleDateFormat> formatter=new ThreadLocal<SimpleDateFormat>(){
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		ThreadLocalExample obj=new ThreadLocalExample();
		for(int i=0;i<5;i++){
			Thread t=new Thread(obj,""+i);
			t.start();
		}
	}
	
	public void run() {
		System.out.println("Thread Name ::"+Thread.currentThread().getName()+" , default formatter ::"+formatter.get().toPattern());
		formatter.set(new SimpleDateFormat());
		System.out.println("Thread Name ::"+Thread.currentThread().getName()+" ,  formatter ::"+formatter.get().toPattern());
	}

}
