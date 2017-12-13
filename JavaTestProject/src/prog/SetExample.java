package prog;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("twe");
		set.add("three");
		
		for (String string : set) {
			System.out.println(string);
		}
	}
}
