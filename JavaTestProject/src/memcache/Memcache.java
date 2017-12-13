package memcache;

import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

import java.net.*;

public class Memcache {
	public static void main(String[] args) {
		try {
			// Connecting to Memcached server on localhost
			MemcachedClient mcc = new MemcachedClient(new InetSocketAddress(
					"127.0.0.1", 11211));
			System.out.println("Connection to server sucessful.");

			OperationFuture<Boolean> future = mcc.set("key1", 2, "Value1");
			System.out.println(future.getStatus().isSuccess());

			//future = mcc.add("key1", 1, "New Value");
			//System.out.println(future.getStatus().isSuccess());
			
			future = mcc.add("key2", 0, "Value2");
			System.out.println(future.getStatus().isSuccess());
			
			future = mcc.append("key1","-appended value");
			System.out.println(future.getStatus().isSuccess());
			
			
			// Shutdowns the memcached client
			mcc.shutdown();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
