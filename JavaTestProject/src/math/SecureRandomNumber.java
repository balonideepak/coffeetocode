package math;

import java.security.SecureRandom;

public class SecureRandomNumber {
	public static void main(String[] args) {
		 SecureRandom random = new SecureRandom();
	      byte bytes[] = new byte[20];
	      random.nextBytes(bytes);
	      System.out.println(random.nextInt());
	}
}
