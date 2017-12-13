package thread.revision.producerconsumer;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Q q=new Q();
		Thread producer = new Producer(q);
		producer.setName("producer");

		Thread consumer = new Consumer(q);
		consumer.setName("consumer");
		
		producer.start();
		consumer.start();
	}

}
