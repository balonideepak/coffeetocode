package thread.revision;

public class ThreadDemo extends Thread{

	@Override
    public void run() {
        int i = 0;

        try {
               while (!Thread.currentThread().isInterrupted()) {
                     Thread.sleep(1000);
                     System.out.println(i++ + " Please press enter key to stop "
                                   + Thread.currentThread().getName());
               }
        } catch (InterruptedException e) {
               System.out.println(Thread.currentThread().getName() + " >>>>  ENDED");
        }
 }
}
