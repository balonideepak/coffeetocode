package test;

import java.text.MessageFormat;

public class Test4 {
	public static void main(String[] args) {
		String result = MessageFormat.format("CLONE-29102-INFO Value \"{0}\" specified for argument \"{1}\" starts with ''-'', is invalid ", "abc","xyz");
		System.out.println(result);
	}
}
