package ds;

public class CircularBuffer2 {

	/**
	 * @author deepak.baloni 
	 * @param args
	 */
	public static void main(String[] args) {
	
	int bufferSize=5;
	CircularBuffer2 classObj=new CircularBuffer2();
    CircularBuffer cb=classObj.new CircularBuffer(bufferSize);
    cb.store(1);
    cb.store(2);
    cb.store(3);
    cb.store(4);
    cb.store(5);

    System.out.println("Stored values in circular buffer are ::");
    for(int i=0;i<bufferSize;i++){
    System.out.println("Read value is ::"+cb.read());
    }
    
    System.out.println("Adding overflow value to circular buffer");
    cb.store(6);
    cb.store(7);
    
    System.out.println("Printing stored  values in circular buffer after values are overriden::");
    for(int i=0;i<bufferSize;i++){
    System.out.println("Read value is ::"+cb.read());
    }
    
	}

	
	class CircularBuffer{
		private int[] data=null;
		private int head;
		private int tail;

		public CircularBuffer(int size) {
		data=new int[size];
		head=0;
		tail=0;
		}
		
		public void store(int value){
			  boolean isfull = isFull();
			  if(isfull){
			   System.out.println("[Info] :: is Buffer full - "+isfull);
			   }
			
			  data[tail]=value;
			tail++;
			if(tail==data.length){
				tail=0;
			}
		}
		
		public int read(){
			int value=data[head++];
			if(head==data.length){
				head=0;
			}
			return value;
		}
		
		public boolean isFull(){
			boolean isFull=false;
			
			if(tail==(data.length-1)&&head==0)
			isFull=true;
			
			return isFull;
		}
		
	}
}
